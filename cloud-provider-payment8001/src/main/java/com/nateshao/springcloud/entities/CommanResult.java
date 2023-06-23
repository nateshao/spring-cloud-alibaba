package com.nateshao.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Date Created by 邵桐杰 on 2023/6/23  11:48
 * @微信公众号 千羽的编程时光
 * @博客 https://nateshao.gitlab.io
 * @GitHub https://github.com/nateshao
 * @Gitee https://gitee.com/nateshao
 * Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommanResult<T> {

    private Integer code;
    private String message;
    private T data;

    public CommanResult(Integer code, String message) {
        this(code, message, null);
    }
}
