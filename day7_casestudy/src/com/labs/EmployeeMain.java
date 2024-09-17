package com.labs;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;
import java.util.stream.Collectors;

public class EmployeeMain {

    public static void getTenure(Employee e) {
        LocalDate curDate = LocalDate.now();
        Period period = Period.between(e.getHireDate(), curDate);
        int months = period.getYears()*12 + period.getMonths();
        int days = period.getDays();
        String duration = (days != 0) ? months + " months and " + days + " days." :
                months + " months." ;
        System.out.println(e.getFirstName() + " " + e.getLastName() + " - Service: " + duration);
    }
    public static void main(String[] args) {
        List<Employee> employees = EmployeeRepository.getEmployees();
        List<Department> depts = EmployeeRepository.getDepartments();

        //Q1
        //List<Double> salaries = new ArrayList<>();
        //employees.forEach((e) -> salaries.add(e.getSalary()));
        //double salSum = salaries.stream().reduce(0.0, Double::sum);
        double salSum = employees.stream().mapToDouble(Employee::getSalary).sum();
        System.out.print("1. Sum of salary of all employees: ");
        System.out.println(salSum);

        // Q2
        Map<String, Integer> deptInfo = new HashMap<>();
        depts.forEach((d) -> deptInfo.put(d.getDepartmentName(), 0));
        for (Employee e: employees) {
            Department dept = e.getDepartment();
            if (dept != null) {
                String deptName = dept.getDepartmentName();
                deptInfo.put(deptName, deptInfo.get(deptName) + 1);
            }
        }
        System.out.println("\n2. Department names and count of employees in each department: ");
        deptInfo.forEach((dname, dcount) -> System.out.println(dname + " - " + dcount));

        //Q3
        System.out.println("\n3. Senior most employee of the organization: ");
        System.out.println("a. By position: ");
        employees.stream().filter((e) -> {
            return "Administration".equals(e.getDepartment() != null ? e.getDepartment().getDepartmentName() : null);
        }).forEach((e) -> System.out.println(e.getFirstName() + " " + e.getLastName() + " - " +  e.getDesignation()));

        List<Employee> empExpList = new ArrayList<>();
        empExpList = employees.stream().sorted((e1, e2) -> e1.getHireDate().compareTo(e2.getHireDate()))
                    .collect(Collectors.toList());
        System.out.println("b. By Tenure: ");
        Optional<Employee> senior = empExpList.stream().findFirst();
        senior.ifPresent((s) -> System.out.println(s.getFirstName() + " " + s.getLastName()
                + " - " +  s.getDesignation()));

        //Q4
        System.out.println("\n4. Employee name and duration of their service in months and days: ");
        empExpList.forEach(EmployeeMain::getTenure);

        //Q5
        System.out.println("\n5. Employees without department: ");
        employees.stream().filter((e) -> e.getDepartment() == null)
            .forEach((e) -> System.out.println(e.getFirstName() + " " + e.getLastName()));

        //Q6
        System.out.println("\n6. Department without employees: ");
        deptInfo.entrySet().stream().filter((d) -> d.getValue() == 0)
                .forEach((d) -> System.out.println(d.getKey()));

        //Q7
        System.out.println("\n7. Departments with highest count of employees: ");
        deptInfo.entrySet().stream().sorted((c1, c2) -> Integer.compare(c2.getValue(),c1.getValue()))
                .limit(3).forEach(System.out::println);
    }
}
