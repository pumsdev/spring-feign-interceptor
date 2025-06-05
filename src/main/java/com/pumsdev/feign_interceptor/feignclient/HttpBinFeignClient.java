package com.pumsdev.feign_interceptor.feignclient;

import com.pumsdev.feign_interceptor.configuration.FeignClientConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "httpBinClient",
        url = "https://httpbin.org",
        configuration = FeignClientConfig.class
)
public interface HttpBinFeignClient {
    @GetMapping("/headers")
    Object getHeaders();
}
