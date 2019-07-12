package com.imooc.sell.common.vo;

import lombok.Data;

/**
 * HTTP请求返回的对象
 *
 * @author : ZHOUTONG
 * @date : 2019/7/11 07:58
 */
@Data
public class Result<T> {

    /**
     * 错误码(返回状态)
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体参数
     */
    private T data;
}
