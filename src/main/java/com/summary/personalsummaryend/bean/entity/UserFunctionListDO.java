package com.summary.personalsummaryend.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author warmwind
 * @createTime 2023/5/12 12:40
 */
@TableName("user_function_list")
@Data
public class UserFunctionListDO {

    @TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "path")
    private String path;

    @TableField(value = "component_name")
    private String componentName;

    @TableField(value = "menu_name")
    private String menuName;

    @TableField(value = "menu_img_url")
    private String menuImgUrl;

    @TableField(value = "user_id")
    private String userId;

}
