package com.ashutosh.restaurant_management.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class CustomerIdValidatorInterceptor implements HandlerInterceptor  {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String customerId = request.getHeader("customerId");
        if(!StringUtils.hasText(customerId)){
            throw new BadRequestException("Customer Id cannot be null.");
        }
        return true;
    }
}
