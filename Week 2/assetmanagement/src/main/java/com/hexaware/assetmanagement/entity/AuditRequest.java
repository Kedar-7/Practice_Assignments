package com.hexaware.assetmanagement.entity;

import javax.persistence.*;
import java.time.*;

@Entity
@Table(name = "audit_requests")
public class AuditRequest {
    
    @Id
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "employee_id")
    private Employee employee;
    
    @Column(name = "request_date")
    private LocalDate requestDate;
    
    @Column(name = "description")
    private String description;
    
    @Column(name = "status")
    private String status; 
    
    // Constructors
    public AuditRequest() {
    }
    
    public AuditRequest(Employee employee, LocalDate requestDate, String description, String status) {
        this.employee = employee;
        this.requestDate = requestDate;
        this.description = description;
        this.status = status;
    }
    
    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public LocalDate getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(LocalDate requestDate) {
        this.requestDate = requestDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
