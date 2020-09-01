package com.example.hibernateexample;
import org.springframework.data.repository.CrudRepository;

public interface DepartmentRepository extends
        CrudRepository <Department, Integer> {
}
