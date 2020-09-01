package com.example.hibernateexample;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

// Entity mówi że bedzie to (automatycznie) łączone z tabelka w bazie danych
@Entity
@Table (name = "EMP") // w bazie danych kolumna pracownikow to EMP
@Setter
@Getter
@NoArgsConstructor

public class Employee {
    @Column(name = "EMPNO")
    @Id // to bedzie klucz glowny
    private Integer id;

    @Column(name = "ENAME")
    private String name;

    @Column(name = "JOB")
    private String job;

    @ManyToOne
    @JoinColumn (name = "DEPTNO")
    private Department department;

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                ", department=" + department.getName() +
                '}';
    }
}
