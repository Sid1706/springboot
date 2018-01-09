package com.example.demo.service;

import com.example.demo.domain.Employee;
import com.example.demo.repository.EmployeeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {


   @Autowired
   EmployeeRepository employeeRepository;


    public Employee getEmployee(Integer employeeId)
    {
        Employee employee= employeeRepository.findById(employeeId);
        return employee;
    }

    public List<Employee> getEmployeeByFirstName(String firstName){
        return employeeRepository.findAllByFirstName(firstName);
    }

}
