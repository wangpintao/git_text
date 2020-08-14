package com.huayu.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@TableName(value = "per_urole")
public class PermissionOrRole {
    @TableId(value = "prid",type = IdType.AUTO)
    private Integer prid;
    private Integer pid;
    private Integer urid;

    public Integer getPrid() {
        return prid;
    }

    public void setPrid(Integer prid) {
        this.prid = prid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public Integer getUrid() {
        return urid;
    }

    public void setUrid(Integer urid) {
        this.urid = urid;
    }

    @Override
    public String toString() {
        return "PermissionOrRole{" +
                "prid=" + prid +
                ", pid=" + pid +
                ", urid=" + urid +
                '}';
    }
}
