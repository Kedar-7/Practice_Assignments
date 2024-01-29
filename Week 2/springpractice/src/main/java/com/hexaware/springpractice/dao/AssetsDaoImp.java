package com.hexaware.springpractice.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springpractice.entity.Assets;

@Repository
public class AssetsDaoImp implements IAssetsDao {
	JdbcTemplate jdbcTemplate;
	
	@Autowired
	public AssetsDaoImp(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public boolean insertAssets(Assets asset) {
		String insertValues = "INSERT INTO Assets (AssetID, AssetNo, AssetName, AssetCategory, AssetModel, ManufacturingDate, ExpiryDate, AssetValue, Status) values (?,?,?,?,?,?,?,?,?)";
		int count = jdbcTemplate.update(insertValues,asset.getAssetId(),asset.getAssetNo(),asset.getAssetName(),asset.getAssetCategory(),asset.getAssetModel(),asset.getManufacturingDate(),asset.getExpiryDate(),asset.getAssetValue(),asset.getStatus());
		return count > 0;
	}


	@Override
	public Assets selectAssetsByName(String assetName) {
		String selectByName = "select AssetID, AssetNo, AssetName, AssetCategory, AssetModel, ManufacturingDate, ExpiryDate, AssetValue, Status from Assets where AssetName = ?";
		Assets asset = jdbcTemplate.queryForObject(selectByName, new AssetsMapper(), assetName);
		return asset;
		 
	}

	@Override
	public List<Assets> selectAllAssets() {
		String selectAll = "select AssetID, AssetNo, AssetName, AssetCategory, AssetModel, ManufacturingDate, ExpiryDate, AssetValue, Status from Assets";
		List<Assets> list = jdbcTemplate.query(selectAll, new AssetsMapper());
		return list;
	}
}
