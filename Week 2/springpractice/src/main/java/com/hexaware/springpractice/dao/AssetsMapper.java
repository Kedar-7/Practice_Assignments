package com.hexaware.springpractice.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hexaware.springpractice.entity.Assets;

public class AssetsMapper implements RowMapper<Assets> {
	

	@Override
	public Assets mapRow(ResultSet rs, int rowNum) throws SQLException {
		Assets asset = new Assets();
		asset.setAssetId(rs.getInt("AssetId"));
		asset.setAssetNo(rs.getString("AssetNo"));
		asset.setAssetName(rs.getString("AssetName"));
		asset.setAssetCategory(rs.getString("AssetCategory"));
		asset.setAssetModel(rs.getString("AssetModel"));
		asset.setManufacturingDate(rs.getDate("ManufacturingDate"));
		asset.setExpiryDate(rs.getDate("ExpiryDate"));
		asset.setAssetValue(rs.getBigDecimal("AssetValue"));
		asset.setStatus(rs.getString("Status"));
		return asset;
	}
}
