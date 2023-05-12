package com.summary.personalsummaryend.bean.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author warmwind
 * @createTime 2023/5/12 12:42
 */
@Data
public class UserFunctionListVO {

    private String path;

    private String componentName;

    private String menuName;

    private String menuImgUrl;

    private String userId;
}
