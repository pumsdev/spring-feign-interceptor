package com.pumsdev.feign_interceptor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FeignInterceptorApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignInterceptorApplication.class, args);
	}

}
