package com.matrix.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 注解说明
 *
 * @Author: yihaosun
 * @Date: 2/22/2021 10:37
 */

@Target(ElementType.FIELD)  // 字段注解
@Retention(RetentionPolicy.RUNTIME)  // 保留到运行时
public @interface MyField {
    String description();
    int length();
}
