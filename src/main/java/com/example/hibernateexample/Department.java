package com.example.hibernateexample;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
@Table (name = "DEPT")
@Setter
@Getter
@NoArgsConstructor
public class Department {
    @Column(name = "DEPTNO")
    @Id // to bedzie klucz glowny
    private Integer id;

    @Column(name = "DNAME")
    private String name;

    @Column(name = "LOC")
    private String loc;

    //@MappedBy to jest nazwa pola z drugiej klasy (czyli @JoinColumn)
    @OneToMany (mappedBy = "department")
    private List<Employee> employees = new ArrayList<>();

    @Override
    public String toString() {
        return "Department{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loc='" + loc + '\'' +
                ", employees=" + employees +
                '}';
    }
}
