package com.ashutosh.restaurant_management.config;

import com.ashutosh.restaurant_management.interceptor.CustomerIdValidatorInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@RequiredArgsConstructor
public class InterceptorConfig implements WebMvcConfigurer {
    private final CustomerIdValidatorInterceptor customerIdValidatorInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customerIdValidatorInterceptor)
                .addPathPatterns(
                        "/customer",
                        "customer/profile"
                );
    }
}
