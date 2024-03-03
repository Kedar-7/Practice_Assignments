package com.hexaware.springrestprac.service;

import java.util.List;

import com.hexaware.springrestprac.entity.Assets;


public interface IAssetsService {
	public List<Assets> getAllAssets();
	public Assets addAssets(Assets asset);
	public Assets updateAssets(Assets asset);
	public Assets getAssetById(int assetId);
	public String deleteAssetById(int assetId);

}
