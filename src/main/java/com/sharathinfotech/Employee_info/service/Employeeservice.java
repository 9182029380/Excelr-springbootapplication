package com.sharathinfotech.Employee_info.service;

import com.sharathinfotech.Employee_info.Model.Employee;
import com.sharathinfotech.Employee_info.repository.Employeerepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employeeservice {
    @Autowired
    private Employeerepository repo;
    public Employee addEmployee(Employee employee) {
        return repo.save(employee);
    }
}
