package com.springboot;

import org.junit.Test;

public class DemoTest {

    @Test
    public void testException() {
        try {
            System.out.println("print log");
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("print exception");
        }
    }
}
