package com.summary.personalsummaryend.bean.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author warmwind
 * @createTime 2023/5/12 11:54
 */
@Data
@TableName("user_all")
public class UserDO {




    @TableField(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @TableField(value = "username")
    private String username;

    @TableField(value = "password")
    private String password;


    @TableField(value = "email")
    private String email;

}
