package com.hexaware.springpractice.service;

import java.util.List;

import com.hexaware.springpractice.entity.Assets;

public interface IAssetsService {
	
	public boolean insertAssets(Assets assets);
	public Assets selectAssetsByName(String assetName);
	public List<Assets> selectAllAssets();
}
