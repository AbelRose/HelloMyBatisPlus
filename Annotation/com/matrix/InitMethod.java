package com.matrix.mybatisplus;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author yihaosun
 * @Date 2/21/2021 21:47
 */
@Target(ElementType.METHOD)  // 指定在哪里使用的 METHOD 是指只能在方法上使用 TYP是针对于类的
@Retention(RetentionPolicy.RUNTIME)  // 是运行的时候使用
// 上面两个是源注解
public @interface InitMethod {
}
