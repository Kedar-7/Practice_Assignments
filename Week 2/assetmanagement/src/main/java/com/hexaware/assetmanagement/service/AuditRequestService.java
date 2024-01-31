package com.hexaware.assetmanagement.service;

public interface AuditRequestService {
    void createAuditRequest(Long employeeId, String description);
    void updateAuditRequestStatus(Long auditRequestId, String status);
   
}
