package com.springboot.controller;

import com.springboot.service.TulingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * [功能描述]：
 * Copyright (c) 2019 Troila
 *
 * @author 杨 琳
 * @version 1.0, 2019/5/20
 * @since XTJCB
 */
@RestController
public class TulingController {

    //自动注入 tulingServiceImpl
//    @Autowired
//    private TulingServiceImpl tulingServiceImpl;

    /*@RequestMapping("testTuling")
    public String testTuling() {
        tulingServiceImpl.testService();
        return "tulingOk";
    }*/

}
