package com.imooc.sell.utils;

import com.imooc.sell.common.vo.Result;

/**
 * @author : ZHOUTONG
 * @date : 2019/7/11 10:44
 */
public class JsonResult {

    public static Result success(Object object) {
        Result resultVO = new Result();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result resultVO = new Result();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
