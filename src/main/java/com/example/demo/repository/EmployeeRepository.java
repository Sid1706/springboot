package com.example.demo.repository;


import com.example.demo.domain.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer> {


   Employee findById(Integer employeeId);

   List<Employee> findAllByFirstName(String firstName);

   List<Employee> findAllByLastName(String lastName);


   Employee getAllByAddress(String address);

   @Query("Select emp from Employee emp where emp.firstName = :name")
   List<Employee> getnames(@Param("name") String name);

}
