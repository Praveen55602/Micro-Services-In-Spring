package com.example.departmentservice.client;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.service.annotation.GetExchange;
import org.springframework.web.service.annotation.HttpExchange;

import com.example.departmentservice.model.Employee;

// this employee client will be used to call the findbydepartment function of the employee controller
// right now since it's just an simple interface direct bean of this cannot be created first a configuration file needs to be created
@HttpExchange
public interface EmployeeClient {
    // don't forget to add the employee here because in the employee controller
    // /employee was at class level so at the function level only
    // department/{departmentId} was there but here we'll need it complete
    @GetExchange("employee/department/{departmentId}")
    public List<Employee> findByDepartment(@PathVariable("departmentId") Long id);
}
