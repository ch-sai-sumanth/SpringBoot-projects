package com.geekster.EmployeeAddress.repository;

import com.geekster.EmployeeAddress.models.Employee;
import jakarta.persistence.Embeddable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee,Integer> {
}
