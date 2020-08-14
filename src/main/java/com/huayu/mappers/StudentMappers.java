package com.huayu.mappers;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.huayu.pojo.Student;
import com.huayu.sqlUtils.myBatisSql;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMappers extends BaseMapper<Student> {
    //多对多
    @Results({
            @Result(column = "gname",property = "gra.gname"),
            /*@Result(column = "sid",property = "roleList",many=@Many(select = "com.huayu.dao.RoleMappers.querybyid"))*/
    })
    @SelectProvider(type = myBatisSql.class,method = "selectMany")
    List<Student> queryMany(Page<Student> page, Integer limit, @Param("student") Student student);
}
