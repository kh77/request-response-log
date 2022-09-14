package com.sm.filter.second;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RequestLogFilterConfig {

    @Bean
    public HttpRequestResponseLogFilter filter() {
        return new HttpRequestResponseLogFilter();
    }
}
