package com.huayu.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "userrole")
public class UserRole {
    @TableId(value = "urid")
    private Integer urid;
    private String urname;

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    public String getUrname() {
        return urname;
    }

    public void setUrname(String urname) {
        this.urname = urname;
    }

    @Override
    public String toString() {
        return "UserRole{" +
                "urid=" + urid +
                ", urname='" + urname + '\'' +
                '}';
    }
}
