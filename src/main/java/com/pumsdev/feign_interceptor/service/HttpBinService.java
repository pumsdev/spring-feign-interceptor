package com.pumsdev.feign_interceptor.service;

import com.pumsdev.feign_interceptor.feignclient.HttpBinFeignClient;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class HttpBinService {
    private final HttpBinFeignClient httpBinFeignClient;

    public Object getHeaders() {
        log.info("Fetching headers");
        return httpBinFeignClient.getHeaders();
    }
}
