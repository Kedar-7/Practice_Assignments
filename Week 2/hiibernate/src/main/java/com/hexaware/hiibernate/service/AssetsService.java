package com.hexaware.hiibernate.service;

import java.util.List;
import com.hexaware.hiibernate.entity.Assets;
import com.hexaware.hiibernate.dao.AssetsDao;
import com.hexaware.hiibernate.dao.IAssetsDao;

public class AssetsService implements IAssetsService{
    IAssetsDao dao = new AssetsDao();

    
    
	@Override
	public List<Assets> getAllAssets() {
		// TODO Auto-generated method stub
    	return dao.getAllAssets();
	}



	@Override
	public Assets getAssetById(int assetId) {
		// TODO Auto-generated method stub
		return dao.getAssetById(assetId);
	}
	
	@Override
	public boolean deleteAssetById(int assetId) {
		return dao.deleteAssetById(assetId);
	}

    
}
