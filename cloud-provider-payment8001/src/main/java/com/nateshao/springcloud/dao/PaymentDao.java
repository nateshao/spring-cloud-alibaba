package com.nateshao.springcloud.dao;

import com.nateshao.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Date Created by 邵桐杰 on 2023/6/23  11:27
 * @微信公众号 千羽的编程时光
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
@Mapper
public interface PaymentDao {
    public int insert(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}
