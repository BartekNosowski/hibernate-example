package com.example.hibernateexample;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Entity mówi że bedzie to (automatycznie) łączone z tabelka w bazie danych
@Entity
@Table (name = "EMP") // w bazie danych kolumna pracownikow to EMP
@Data
@NoArgsConstructor

public class Employee {
    @Column(name = "EMPNO")
    @Id // to bedzie klucz glowny
    private Integer Id;

    @Column(name = "ENAME")
    private String name;

    @Column(name = "JOB")
    private String job;
}
