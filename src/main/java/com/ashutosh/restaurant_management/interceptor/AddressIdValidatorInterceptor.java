package com.ashutosh.restaurant_management.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.coyote.BadRequestException;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class AddressIdValidatorInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception{
        String addressId = request.getHeader("addressId");
        if(!StringUtils.hasText(addressId)){
            throw new BadRequestException("Address Id cannot be null or empty.");
        }
        return true;
    }
}
