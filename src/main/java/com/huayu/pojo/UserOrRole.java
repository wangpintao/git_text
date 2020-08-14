package com.huayu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "user_role")
public class UserOrRole {
    @TableId(value = "zid",type = IdType.AUTO)
    private Integer zid;
    private Integer uid;
    private Integer urid;

    public Integer getZid() {
        return zid;
    }

    public void setZid(Integer zid) {
        this.zid = zid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    @Override
    public String toString() {
        return "UserOrRole{" +
                "zid=" + zid +
                ", uid=" + uid +
                ", urid=" + urid +
                '}';
    }
}
