package com.nateshao.springcloud.service;

import com.nateshao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Date Created by 邵桐杰 on 2023/6/23  11:28
 * @微信公众号 千羽的编程时光
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
public interface PaymentService {
    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
