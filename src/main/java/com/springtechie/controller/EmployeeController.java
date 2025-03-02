package com.springtechie.controller;

import com.springtechie.entity.Employee;
import com.springtechie.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/employee")
public class EmployeeController {

    private final EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    // CRUD:

    @PostMapping("/save")
    public String createEmployee(@RequestBody Employee employee) {
      return employeeService.saveEmployee(employee);
    }

    // Read
    @GetMapping("/get/id/{id}")
    public Employee getEmployee(@PathVariable int id) {
      return employeeService.getEmployeeById(id);
    }

    // TODO
    // fetch all employees
    // update employee name, if employee ecists update it else create it
    // delete employye bases on id
    // delete all employees
    // find count all employee in DB.
    //
}
