package com.pinyougou.mapper;

import org.apache.ibatis.annotations.Select;
import tk.mybatis.mapper.common.Mapper;

import com.pinyougou.pojo.User;

/**
 * UserMapper 数据访问接口
 * @date 2019-02-27 09:55:07
 * @version 1.0
 */
public interface UserMapper extends Mapper<User>{

    @Select("SELECT * from tb_user where username = #{username}")
    User findUserByUserName(String username);
}