package com.hexaware.assetmanagement.service;

import java.util.List;

import com.hexaware.assetmanagement.entity.Assets;

public interface AssetService {
    List<Assets> getAllAssets();
    Assets getAssetById(Long assetId);
    
}
