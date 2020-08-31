package com.example.hibernateexample;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee,Integer> {

    // crud ------------->     CREATE READ UPDATE DELETE

    // void save (Employee var1);
    // Iterable<Employee> findAll();




}
