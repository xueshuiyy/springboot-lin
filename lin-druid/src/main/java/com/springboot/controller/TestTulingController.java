package com.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestTulingController {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("/testTuling")
    public List<Map<String,Object>> tulingHello() {
        List<Map<String,Object>> accountList = jdbcTemplate.queryForList("select * from account");
        return accountList;
    }
}
