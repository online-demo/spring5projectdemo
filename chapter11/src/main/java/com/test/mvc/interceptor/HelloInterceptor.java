package com.test.mvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @Author zhouguanya
 * @Date 2018/12/17
 * @Description
 */
public class HelloInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.printf("进入preHandle方法，请求URL=%s,请求URI=%s%n",request.getRequestURL().toString(), request.getRequestURI());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.printf("进入postHandle方法，请求URL=%s,请求URI=%s%n",request.getRequestURL().toString(), request.getRequestURI());
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.printf("进入afterCompletion方法，请求URL=%s,请求URI=%s%n",request.getRequestURL().toString(), request.getRequestURI());
    }

}
