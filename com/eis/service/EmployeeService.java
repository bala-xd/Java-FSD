package com.eis.service;

import com.eis.bean.Employee;

public interface EmployeeService {
    Employee getEmployeeDetails();
    void findInsuranceScheme(Employee employee);
    void displayEmployeeDetails(Employee employee);
}