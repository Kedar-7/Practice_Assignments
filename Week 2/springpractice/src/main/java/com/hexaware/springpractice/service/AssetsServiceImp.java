package com.hexaware.springpractice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springpractice.dao.IAssetsDao;
import com.hexaware.springpractice.entity.Assets;

@Service
public class AssetsServiceImp implements IAssetsService {
	
	@Autowired
	IAssetsDao dao;

	@Override
	public boolean insertAssets(Assets assets) {
		return dao.insertAssets(assets);
	}

	@Override
	public Assets selectAssetsByName(String assetName) {
		return dao.selectAssetsByName(assetName);
	}

	@Override
	public List<Assets> selectAllAssets() {
		return dao.selectAllAssets();
	}

}
