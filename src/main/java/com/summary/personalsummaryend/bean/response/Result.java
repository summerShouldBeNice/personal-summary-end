package com.summary.personalsummaryend.bean.response;

import com.summary.personalsummaryend.bean.enums.EnumType;
import com.summary.personalsummaryend.bean.enums.ResponseCodeEnum;
import lombok.Data;

/**
 * 统一返回结果集
 * @author warmWind
 * @createTime 2023-17-27 01:17
 */
@Data
public class Result<T> {
    private Integer code = ResponseCodeEnum.SUCCESS.getCode();

    private String msg = ResponseCodeEnum.SUCCESS.getMessage();

    private Boolean success = Boolean.TRUE;

    private T data;

    private Long total;

    private Result(){}

    public static <T> Result<T> buildEmptySuccess(){
        return new Result<>();
    }

    public static <T> Result<T> buildSuccess(T t){
        Result<T> result =  buildEmptySuccess();
        result.setData(t);
        return result;
    }

    public static <T> Result<T> buildSuccess(T t,long total){
        Result<T> result =  buildSuccess(t);
        result.setTotal(total);
        return result;
    }

    public static <T> Result<T> buildFailure(String message){
        Result<T> result =  new Result<>();
        result.setCode(null);
        result.setMsg(message);
        result.setSuccess(false);
        return result;
    }

    public static <T> Result<T> buildFailure(Integer code,String message){
        Result<T> result =  new Result<>();
        result.setCode(code);
        result.setMsg(message);
        result.setSuccess(false);
        return result;
    }

    public static <T> Result<T> buildFailure(EnumType enumType){
        Result<T> result =  new Result<>();
        result.setCode(enumType.getCode());
        result.setMsg(enumType.getMessage());
        result.setSuccess(false);
        return result;
    }

    public boolean isSuccess(){
        return  success;
    }


    public boolean isFailed(){
        return  !success;
    }
}
