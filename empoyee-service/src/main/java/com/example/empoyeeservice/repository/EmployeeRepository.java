package com.example.empoyeeservice.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.empoyeeservice.model.Employee;

/**
 * DepartmentRepository
 */
@Repository
public class EmployeeRepository {
    private List<Employee> employees = new ArrayList<>();

    public Employee addEmployee(Employee employee) {
        employees.add(employee);
        return employee;
    }

    public Employee findById(Long id) {
        return employees.stream().filter(employee -> employee.id().equals(id)).findFirst().orElseThrow();
    }

    public List<Employee> findAll() {
        return employees;
    }

    public List<Employee> findByDepartment(Long departmentId) {
        return employees.stream().filter(a -> a.DepartmentID().equals(departmentId)).toList();
    }
}