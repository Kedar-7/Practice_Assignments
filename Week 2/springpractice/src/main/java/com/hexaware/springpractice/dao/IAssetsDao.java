package com.hexaware.springpractice.dao;

import java.util.List;

import com.hexaware.springpractice.entity.Assets;

public interface IAssetsDao {
	
	public boolean insertAssets(Assets assets);
	public Assets selectAssetsByName(String assetName);
	public List<Assets> selectAllAssets();

}
