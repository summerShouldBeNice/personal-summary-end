package com.summary.personalsummaryend;

import com.alibaba.fastjson2.JSON;
import com.summary.personalsummaryend.bean.entity.UserDO;
import com.summary.personalsummaryend.bean.request.LoginRequest;
import com.summary.personalsummaryend.bean.response.Result;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;
import com.summary.personalsummaryend.mapper.UserMapper;
import com.summary.personalsummaryend.service.UserFunctionListService;
import com.summary.personalsummaryend.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class PersonalSummaryEndApplicationTests {

    @Resource
    UserService userService;

    @Resource
    UserFunctionListService userFunctionListService;

    @Resource
    UserMapper userMapper;
    @Test
    void contextLoads() {

        List<UserFunctionListVO> userFunctionListVOS = userFunctionListService.queryUserFunctionListByUserId(1);
        System.out.println(userFunctionListVOS);

    }


    @Test
    void testLogin() {
        LoginRequest loginRequest = new LoginRequest();
        loginRequest.setUsername("warmwind");
        loginRequest.setPassword("qq2693387413");
        Result<List<UserFunctionListVO>> login = userService.login(loginRequest);
        System.out.println(login);
    }

}
