package com.nateshao.springcloud.controller;

import com.nateshao.springcloud.entities.CommanResult;
import com.nateshao.springcloud.entities.Payment;
import com.nateshao.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @Date Created by 邵桐杰 on 2023/6/23  11:27
 * @微信公众号 千羽的编程时光
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @PostMapping("/insert")
    public CommanResult insert(Payment payment) {
        int res = paymentService.insert(payment);
        log.info("********************插入结果：" + res);
        if (res > 0) return new CommanResult(200, "插入数据成功", res);
        else return new CommanResult(444, "插入数据库失败", null);

    }

    @GetMapping("/queryById/{id}")
    public CommanResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment res = paymentService.getPaymentById(id);
        log.info("********************查询结果：" + res+"dsaaaaaaaaaaaa");
        if (res != null) return new CommanResult(200, "查询数据成功", res);
        else return new CommanResult(444, "查询数据库失败", null);
    }
}
