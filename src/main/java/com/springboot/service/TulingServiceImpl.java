package com.springboot.service;

import com.springboot.dao.TulingDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * [功能描述]：
 * Copyright (c) 2019 Troila
 *
 * @author 杨 琳
 * @version 1.0, 2019/5/20
 * @since XTJCB
 */
public class TulingServiceImpl {

//    @Autowired
//    private TulingDao tulingDao;

    public void testService() {
//        tulingDao.testTulingDao();
        System.out.println("我是通过importSelector导入进来的service");
    }
}
