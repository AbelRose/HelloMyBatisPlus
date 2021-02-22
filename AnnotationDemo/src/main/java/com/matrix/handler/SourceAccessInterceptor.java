package com.matrix.handler;

import com.matrix.annotation.LoginRequired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: yihaosun
 * @Date: 2/22/2021 11:33
 */
public class SourceAccessInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("进入拦截器了");  // 实现spring的HandlerInterceptor 类先实现拦截器，但不拦截，只是简单打印日志

        // 通过反射获取到方法上的 LoginRequired 注解
        HandlerMethod handlerMethod = (HandlerMethod) handler;
        LoginRequired annotation = ((HandlerMethod) handler).getMethod().getAnnotation(LoginRequired.class);  // 获取Handler
        if (annotation == null) return true;  // 没有注解的话不拦截

        // 有注解的话就说明登录并提示
        response.setContentType("application/json; charset=utf-8");
        response.getWriter().println("");
        response.getWriter().print("你访问的资源需要登录");
        return false;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}