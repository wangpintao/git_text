package com.huayu.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.huayu.pojo.UserRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserRoleMappers extends BaseMapper<UserRole> {
    @Select("select r.urid,r.urname from user_role ur left join userrole r on ur.urid = r.urid where uid = #{value}")
    List<UserRole> queryAllid(Integer uid);
}
