package com.nateshao.springcloud.alibaba.service;

import com.nateshao.springcloud.entities.CommonResult;
import com.nateshao.springcloud.entities.Payment;
import org.springframework.stereotype.Component;

/**
 * @Date Created by 邵桐杰 on 2023/6/24  18:15
 * @微信公众号 千羽的编程时光
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
@Component
public class PaymentFallbackService implements PaymentService {
    @Override
    public CommonResult<Payment> paymentSQL(Long id) {
        return new CommonResult<>(44444, "服务降级返回,---PaymentFallbackService", new Payment(id, "errorSerial"));
    }
}