package com.summary.personalsummaryend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summary.personalsummaryend.bean.entity.UserDO;
import com.summary.personalsummaryend.bean.entity.UserFunctionListDO;
import com.summary.personalsummaryend.bean.enums.ResponseCodeEnum;
import com.summary.personalsummaryend.bean.request.LoginRequest;
import com.summary.personalsummaryend.bean.response.Result;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;
import com.summary.personalsummaryend.mapper.UserFunctionListMapper;
import com.summary.personalsummaryend.mapper.UserMapper;
import com.summary.personalsummaryend.service.UserFunctionListService;
import com.summary.personalsummaryend.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author warmwind
 * @createTime 2023/5/12 11:55
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, UserDO> implements UserService {

    @Resource
    private UserMapper userMapper;


    @Resource
    private UserFunctionListService userFunctionListService;

    /**
     * 用户登录
     * @param LoginRequest
     * @return
     */
    @Override
    public Result<List<UserFunctionListVO>> login(LoginRequest LoginRequest) {
        LambdaQueryWrapper<UserDO> qw = new LambdaQueryWrapper();
        qw.eq(UserDO::getUsername, LoginRequest.getUsername())
                .eq(UserDO::getPassword, LoginRequest.getPassword());
        UserDO userDO = userMapper.selectOne(qw);

        if (userDO == null) {
            return Result.buildFailure("用户名或密码错误");
        }

        List<UserFunctionListVO> userFunctionListVOS = userFunctionListService.queryUserFunctionListByUserId(userDO.getId());

        return Result.buildSuccess(userFunctionListVOS);

    }
}
