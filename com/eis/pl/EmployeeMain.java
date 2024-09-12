// File: com/eis/pl/Main.java

package com.eis.pl;

import com.eis.bean.Employee;
import com.eis.service.EmployeeService;
import com.eis.service.EmployeeServiceImpl;

public class EmployeeMain {
    public static void main(String[] args) {

        EmployeeService employeeService = new EmployeeServiceImpl();

        Employee employee = employeeService.getEmployeeDetails();
        employeeService.findInsuranceScheme(employee);
        employeeService.displayEmployeeDetails(employee);
    }
}
