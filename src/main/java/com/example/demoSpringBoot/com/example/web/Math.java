package com.example.demoSpringBoot.com.example.web;

/**
 * Created by chenchao on 2017/6/23.
 */
public class Math {
    public int factorial(int n) throws Exception {
        if (n < 0) {
            throw new Exception("负数没有阶乘");
        } else if(n <= 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
