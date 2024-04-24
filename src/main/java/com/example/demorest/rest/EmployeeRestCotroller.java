package com.example.demorest.rest;


import com.example.demorest.entity.Employee;
import com.example.demorest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestCotroller {

    private EmployeeService employeeService;
    //quick and dirty: inject employee dao (use constructor injection)
    @Autowired
    public EmployeeRestCotroller(EmployeeService theEmployeeService){

        employeeService = theEmployeeService;
    }

    //expose "/employees" and return a list of all employees
    @GetMapping("/employees")
    public List<Employee> findAll(){
        return employeeService.findAll();

    }

}
