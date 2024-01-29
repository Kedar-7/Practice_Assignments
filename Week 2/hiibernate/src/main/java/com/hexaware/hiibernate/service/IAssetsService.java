package com.hexaware.hiibernate.service;

import java.util.List;

import com.hexaware.hiibernate.entity.Assets;

public interface IAssetsService {
	public List<Assets> getAllAssets();
	public Assets getAssetById(int assetId);
	public boolean deleteAssetById(int assetId);

}
