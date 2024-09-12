package com.eis.service;

import java.util.Scanner;

import com.eis.bean.Employee;

public class EmployeeServiceImpl implements EmployeeService{
    
    @Override
    public Employee getEmployeeDetails() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Employee Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter Employee Designation: ");
        String designation = sc.nextLine();

        sc.close();
        
        return new Employee(id, name, salary, designation);
    }

    @Override
    public void findInsuranceScheme(Employee employee) {
        double salary = employee.getSalary();
        String designation = employee.getDesignation();

        if (salary < 30000) {
            employee.setInsuranceScheme("Basic");
        } else if (salary >= 30000 && salary < 60000) {
            if (designation.equalsIgnoreCase("Manager")) {
                employee.setInsuranceScheme("Standard");
            } else {
                employee.setInsuranceScheme("Basic");
            }
        } else {
            employee.setInsuranceScheme("Premium");
        }
    }

    @Override
    public void displayEmployeeDetails(Employee employee) {
        System.out.println(employee);
    }

}
