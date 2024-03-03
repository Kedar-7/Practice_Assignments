package com.hexaware.springrestprac.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestprac.entity.Assets;
import com.hexaware.springrestprac.repository.AssetsRepository;

@Service
public class AssetsServiceImp implements IAssetsService{
	
	@Autowired
	AssetsRepository repo;
	
	
	@Override
	public List<Assets> getAllAssets() {
		return repo.findAll();
	}


	@Override
	public Assets addAssets(Assets asset) {
		return repo.save(asset);
	}


	@Override
	public Assets updateAssets(Assets asset) {
		return repo.save(asset);
	}


	@Override
	public Assets getAssetById(int assetId) {
		return repo.findById(assetId).orElse(null);
	}


	@Override
	public String deleteAssetById(int assetId) {
		 repo.deleteById(assetId);
		 return "Record Deleted";
	}
	
}
