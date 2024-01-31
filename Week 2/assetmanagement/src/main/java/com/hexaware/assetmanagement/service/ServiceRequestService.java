package com.hexaware.assetmanagement.service;

public interface ServiceRequestService {
    void createServiceRequest(Long employeeId, String description);
    void updateServiceRequestStatus(Long serviceRequestId, String status);
}
