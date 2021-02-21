package com.matrix.mybatisplus;

/**
 * @Author yihaosun
 * @Date 2/21/2021 21:51
 */
public class InitDemo {
    @InitMethod
    public void init() {
        System.out.println("init...");
    }

    @InitMethod
    public void test() {
        System.out.println("test...");
    }
}
