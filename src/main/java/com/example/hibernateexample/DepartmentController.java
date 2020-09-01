package com.example.hibernateexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class DepartmentController {

    private DepartmentRepository departmentRepository;

    public DepartmentController(DepartmentRepository departmentRepository){
        this.departmentRepository = departmentRepository;
    }

    @GetMapping("/dept")
    public String deptList(ModelMap map){
        map.put("departments",departmentRepository.findAll());
        return "deptList";
    }
//    @Autowired
//    private DepartmentRepository departmentRepository;


}
