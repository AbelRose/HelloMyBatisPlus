package com.matrix.mybatisplus;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/**
 * @Author yihaosun
 * @Date 2/21/2021 21:53
 */

// 根据spring的反射判断
public class Test {
    public static void main(String[] args) throws Exception{
        Class clazz = Class.forName("com.matrix.mybatisplus.InitDemo");
        // 判断类是否有注解
        // Annotation annotation = clazz.getAnnotation();
        // boolean equals = annotation.equals(null);

        // 判断方法是否有注解
        Method[] methods = clazz.getMethods();
        if (methods != null) {
            for (Method method : methods) {
                boolean isInitMethod = method.isAnnotationPresent(InitMethod.class);
//                System.out.println(method.getName()+ " : "+isInitMethod);
                if (isInitMethod) {
                    method.invoke(clazz.getConstructor(null).newInstance(null), null);
                }
            }
        }
    }
}
