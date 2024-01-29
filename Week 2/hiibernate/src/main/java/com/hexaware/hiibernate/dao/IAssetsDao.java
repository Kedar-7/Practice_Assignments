package com.hexaware.hiibernate.dao;

import java.util.List;

import com.hexaware.hiibernate.entity.Assets;

public interface IAssetsDao {
	public List<Assets> getAllAssets();
	public Assets getAssetById(int assetId);
	public boolean deleteAssetById(int assetId);
}
