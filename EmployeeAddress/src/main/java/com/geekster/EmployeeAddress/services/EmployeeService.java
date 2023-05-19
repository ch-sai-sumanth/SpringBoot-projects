package com.geekster.EmployeeAddress.services;

import com.geekster.EmployeeAddress.models.Employee;
import com.geekster.EmployeeAddress.repository.IEmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    IEmployeeRepository iEmployeeRepository;
    public Iterable<Employee> getAllEmployees()
    {
        return iEmployeeRepository.findAll();
    }

    public Optional<Employee> getEmployeeById(int id) {
        return iEmployeeRepository.findById(id);
    }

    public void addEmployee(Employee employee) {

        iEmployeeRepository.save(employee);
    }

    public void updateEmployee(Employee employee, int id) {
       employee.setEmployeeId(id);
       iEmployeeRepository.save(employee);
    }

    public void deleteEmployee(int id) {
        iEmployeeRepository.deleteById(id);
    }
}
