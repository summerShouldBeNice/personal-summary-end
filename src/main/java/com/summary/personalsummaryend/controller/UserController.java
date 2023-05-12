package com.summary.personalsummaryend.controller;

import com.summary.personalsummaryend.bean.request.LoginRequest;
import com.summary.personalsummaryend.bean.response.Result;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;
import com.summary.personalsummaryend.service.UserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author warmwind
 * @createTime 2023/5/12 11:57
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @PostMapping("/login")
    public Result<List<UserFunctionListVO>> userLogin(@RequestBody @Validated LoginRequest loginRequest) {
        return userService.login(loginRequest);
    }
}
