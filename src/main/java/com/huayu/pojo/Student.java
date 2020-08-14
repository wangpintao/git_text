package com.huayu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName("student")
public class Student {
    @TableId(type = IdType.ASSIGN_UUID)
    private String sid;
    @TableField("stuname")
    private String stuName;
    private Integer pwd;
    private Integer age;
    private String sex;
    private String image;
    private Integer gaid;
    @TableField(exist = false)
    private Grade gra;

    public Integer getPwd() {
        return pwd;
    }

    public void setPwd(Integer pwd) {
        this.pwd = pwd;
    }

    public Grade getGra() {
        return gra;
    }

    public void setGra(Grade gra) {
        this.gra = gra;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getGaid() {
        return gaid;
    }

    public void setGaid(Integer gaid) {
        this.gaid = gaid;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid='" + sid + '\'' +
                ", stuName='" + stuName + '\'' +
                ", pwd=" + pwd +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", image='" + image + '\'' +
                ", gaid=" + gaid +
                ", gra=" + gra +
                '}';
    }
}
