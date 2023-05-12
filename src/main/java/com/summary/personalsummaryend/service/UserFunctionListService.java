package com.summary.personalsummaryend.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.summary.personalsummaryend.bean.entity.UserFunctionListDO;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;

import java.util.List;

/**
 * @author warmwind
 * @createTime 2023/5/12 16:22
 */
public interface UserFunctionListService extends IService<UserFunctionListDO> {

    List<UserFunctionListVO> queryUserFunctionListByUserId(int userId);
}
