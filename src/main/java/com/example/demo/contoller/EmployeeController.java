package com.example.demo.contoller;

import com.example.demo.domain.Employee;
import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;


    @RequestMapping(value = "/{id}")
    public Employee getEmployee(@PathVariable("id") Integer id){
        return employeeService.getEmployee(id);
    }

    @RequestMapping(value = "/employee/{firstName}")
    public List<Employee> getEmployees(@PathVariable("firstName") String  firstName){
        return employeeService.getEmployeeByFirstName(firstName);
    }


}
