package com.summary.personalsummaryend.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.summary.personalsummaryend.bean.entity.UserFunctionListDO;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;
import com.summary.personalsummaryend.mapper.UserFunctionListMapper;
import com.summary.personalsummaryend.service.UserFunctionListService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author warmwind
 * @createTime 2023/5/12 16:23
 */
@Service
public class UserFunctionListServiceImpl extends ServiceImpl<UserFunctionListMapper, UserFunctionListDO>
        implements UserFunctionListService {

    @Resource
    private UserFunctionListMapper userFunctionListMapper;

    /**
     * 根据用户id查询用户功能列表
     * @param userId
     * @return
     */
    public List<UserFunctionListVO> queryUserFunctionListByUserId(int userId) {
        LambdaQueryWrapper<UserFunctionListDO> qw = new LambdaQueryWrapper();
        qw.eq(UserFunctionListDO::getUserId, userId);

        List<UserFunctionListDO> userFunctionListDOS = userFunctionListMapper.selectList(qw);
        List<UserFunctionListVO> userFunctionListVOS = new ArrayList<>();
        for(UserFunctionListDO userFunctionListDO : userFunctionListDOS) {
            UserFunctionListVO userFunctionListVO = new UserFunctionListVO();
            BeanUtils.copyProperties(userFunctionListDO, userFunctionListVO);
            userFunctionListVOS.add(userFunctionListVO);
        }
        return userFunctionListVOS;
    }

}
