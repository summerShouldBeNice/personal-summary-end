package com.summary.personalsummaryend.bean.request;

import lombok.Data;
import lombok.NonNull;

import javax.validation.constraints.NotBlank;

/**
 * @author warmwind
 * @createTime 2023/5/12 12:30
 */
@Data
public class LoginRequest {

    @NotBlank
    private String username;

    @NotBlank
    private String password;
}
