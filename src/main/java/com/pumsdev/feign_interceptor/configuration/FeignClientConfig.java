package com.pumsdev.feign_interceptor.configuration;

import com.pumsdev.feign_interceptor.interceptor.ApiKeyRequestInterceptor;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class FeignClientConfig {
    @Value("${api.key:demo-api-key}")
    private String apiKey;

    @Bean
    public RequestInterceptor apiKeyRequestInterceptor() {
        return new ApiKeyRequestInterceptor(apiKey);
    }

    @Bean
    public RequestInterceptor test() {
        return template -> template.header("x-test", "test-x");
    }
}
