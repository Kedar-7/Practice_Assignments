package com.hexaware.assetmanagement.service;

import com.hexaware.assetmanagement.entity.Employee;

public interface EmployeeService {
    void registerEmployee(Employee employee);
    Employee authenticate(String username, String password);
}
