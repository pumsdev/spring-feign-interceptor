package com.pumsdev.feign_interceptor.feignclient;

import com.pumsdev.feign_interceptor.configuration.FeignClientConfig;
import com.pumsdev.feign_interceptor.model.SimpleModel;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "httpBinClient",
        url = "https://httpbin.org",
        configuration = FeignClientConfig.class
)
public interface HttpBinFeignClient {
    @GetMapping("/headers")
    Object getHeaders();

    @PostMapping("/anything")
    Object postAnything(@RequestBody SimpleModel body);
}
