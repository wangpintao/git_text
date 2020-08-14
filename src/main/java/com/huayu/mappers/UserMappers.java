package com.huayu.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMappers extends BaseMapper<User> {

    //根据用户名查询只取id
    @Select("select uid from user where username =#{username}")
    Integer queryNameByID(String username);
}
