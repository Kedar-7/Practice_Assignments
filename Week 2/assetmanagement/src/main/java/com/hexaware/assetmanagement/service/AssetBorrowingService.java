package com.hexaware.assetmanagement.service;

public interface AssetBorrowingService {
    void borrowAsset(Long employeeId, Long assetId);
    void returnAsset(Long assetBorrowingId);
    
}
