package com.example.demoSpringBoot.com.example.web;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by chenchao on 2017/6/23.
 */
public class MathTest {
    @Before
    public void setUp() throws Exception {
        System.out.print("this is setUp");
    }

    @Test
    public void factorial() throws Exception {
        System.out.print("this is test");
        System.out.print(new Math().factorial(5));
    }

}