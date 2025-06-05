package com.pumsdev.feign_interceptor.controller;

import com.pumsdev.feign_interceptor.service.HttpBinService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
@RequiredArgsConstructor
public class TestController {
    private final HttpBinService httpBinService;

    @GetMapping("/headers")
    public ResponseEntity<Object> getHeaders() {
        return ResponseEntity.ok(httpBinService.getHeaders());
    }
}
