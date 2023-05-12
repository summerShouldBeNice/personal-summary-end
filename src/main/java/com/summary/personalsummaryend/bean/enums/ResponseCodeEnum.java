package com.summary.personalsummaryend.bean.enums;

/**
 * @author warmwind
 * @createTime 2023/4/28 15:23
 */
public enum ResponseCodeEnum implements EnumType {
    SUCCESS(200,"成功"),

    PARAM_ERR(10000,"参数不正确"),

    DATABASE_ERR(20000,"数据库错误"),
    DUPLICATE_KEY_ERR(20001,"唯一约束校验失败"),

    BIZ_ERR(30000,"业务异常"),
    AUTHORITY_ERR(30001,"权限不足"),

    SYSTEM_ERR(90000,"系统异常"),

    IO_ERR(30002, "文件传输异常"),

    REQUEST_TYPE_NOT_SUPPORTED(50000,"请求类型不匹配"),

    ;
    private Integer code;
    private String message;

    ResponseCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
