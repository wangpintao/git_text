package com.huayu.sqlUtils;

import com.github.pagehelper.util.StringUtil;
import com.huayu.pojo.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.util.StringUtils;

public class myBatisSql {
    public String select(Student student){
        StringBuffer sql = new StringBuffer("select * from student where 1=1");
        if (!StringUtils.isEmpty(student)) {
            if (!StringUtil.isEmpty(student.getStuName())) {
                sql.append(" and stuname like '%" + student.getStuName() + "%'");
            }
            if (!StringUtil.isEmpty(student.getSex())) {
                sql.append(" and sex=#{sex}");
            }
            if (null != student.getGaid() && !"".equals(student.getGaid())) {
                sql.append(" and gaid=#{gaid}");
            }
        }
        return sql.toString();
    }
    public String selectMany(@Param("student") Student student){
        StringBuffer sql = new StringBuffer("SELECT * FROM student s LEFT JOIN grade g ON s.`gaid` = g.`gid`  where 1=1");
        if (!StringUtils.isEmpty(student)) {
            if (!StringUtil.isEmpty(student.getStuName())) {
                sql.append(" and stuname like '%" + student.getStuName() + "%'");
            }
            if (!StringUtil.isEmpty(student.getSex())) {
                sql.append(" and sex="+student.getSex());
            }
            if (student.getAge() !=null && !"".equals(student.getAge())) {
                sql.append(" and age="+student.getAge());
            }
            if (null != student.getGaid() && !"".equals(student.getGaid())) {
                sql.append(" and gaid="+student.getGaid());
            }
        }
        return sql.toString();
    }
}
