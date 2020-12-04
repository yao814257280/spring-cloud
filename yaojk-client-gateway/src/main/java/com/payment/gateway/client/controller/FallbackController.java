package com.payment.gateway.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: jiankang
 * Date: 2020-11-30
 * Time: 19:27
 * Description:
 */
@RestController
public class FallbackController {

    // 服务熔断、降级回退提示信息
    @GetMapping(value = "/fallback")
    public String fallback() {
        return "fallback";
    }
}