package com.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LinJdbcApplicationTests {
    @Autowired
    private DataSource dataSource;

	@Test
	public void contextLoads() {
	}

    @Test
    public void testDbType() {
        System.out.println("自动装配数据源的类型:"+dataSource.getClass());
    }


}
