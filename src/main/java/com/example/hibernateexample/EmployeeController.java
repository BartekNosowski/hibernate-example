package com.example.hibernateexample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class EmployeeController {
    @GetMapping("/")
    public String deptList(ModelMap map){
        map.put("employees",employeeRepository.findAll());
        return "list";
    }
    @Autowired // automatyczne laczenie
    /*
    sam spring za nas generuje klase, ktora bedzie implementowala dany interfejs
    bo mamy do czynienia z .... magia... :<
     */
    private EmployeeRepository employeeRepository;
}
