package com.geekster.EmployeeAddress.controllers;

import com.geekster.EmployeeAddress.models.Address;
import com.geekster.EmployeeAddress.models.Employee;
import com.geekster.EmployeeAddress.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @GetMapping("/getEmployees")
    public Iterable<Employee> getAllEmployees()
    {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getEmployeesById/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable int id)
    {
        return employeeService.getEmployeeById(id);
    }

    @PostMapping("/employees")
    public void addEmployee(@RequestBody Employee employee)
    {
        //extracting address details from "employee"
        Address userAddress=employee.getAddress();

        //passing employee to address
        userAddress.setEmployee(employee);

        employeeService.addEmployee(employee);
    }

    @PutMapping("/employees/{id}")
    public void updateEmployee(@RequestBody Employee employee,@PathVariable int id)
    {
        employeeService.updateEmployee(employee,id);
    }

    @DeleteMapping("/employees/{id}")
    public void deleteEmployee(@PathVariable int id)
    {
        employeeService.deleteEmployee(id);
    }
}
