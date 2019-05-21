package com.springboot.controller;

import com.springboot.dto.Account;
import com.springboot.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeMapper employeeMapper;

    @RequestMapping("/findOne/{id}")
    public Account findOne(@PathVariable("id")Integer id) {
        return employeeMapper.findOne(id);
    }

    @RequestMapping("/list")
    public List<Account> list() {
        return employeeMapper.list();
    }

}