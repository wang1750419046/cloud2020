package com.atguigu.springcloud.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentFallbackService implements  PaymentHystrixService{
    @Override
    public String paymentInfo_OK(Integer id) {
        return "paymentfallbackservice is ok";
    }

    @Override
    public String paymentInfo_timeout(Integer id) {
        return "paymentfallbackservice is timeout";
    }
}
