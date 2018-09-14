package com.example.demoswagger.service;

import com.example.demoswagger.entity.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> retrieveEmployees();

    public Employee getEmployee(Long employeeId);

    public void deleteEmployee(Long employeeId);

    public void updateEmployee(Employee employee);

    public void saveEmployee(Employee employee);
}
