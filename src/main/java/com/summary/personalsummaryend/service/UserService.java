package com.summary.personalsummaryend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summary.personalsummaryend.bean.entity.UserDO;
import com.summary.personalsummaryend.bean.request.LoginRequest;
import com.summary.personalsummaryend.bean.response.Result;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;

import java.util.List;

/**
 * @author warmwind
 * @createTime 2023/5/12 11:54
 */
public interface UserService extends IService<UserDO> {
    Result<List<UserFunctionListVO>> login(LoginRequest loginRequest);
}
