package com.summary.personalsummaryend.bean.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

/**
 * @author warmwind
 * @createTime 2023/5/12 12:39
 */

@Data
public class UserVO {

    private Integer id;

    private String username;


    private String password;

    private String email;
}
