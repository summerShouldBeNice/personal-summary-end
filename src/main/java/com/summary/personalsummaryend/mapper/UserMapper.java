package com.summary.personalsummaryend.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.summary.personalsummaryend.bean.entity.UserDO;
import com.summary.personalsummaryend.bean.response.Result;
import com.summary.personalsummaryend.bean.vo.UserFunctionListVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author warmwind
 * @createTime 2023/5/12 11:53
 */
@Mapper
public interface UserMapper extends BaseMapper<UserDO> {

}
