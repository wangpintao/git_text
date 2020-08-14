package com.huayu.pojo;

import java.util.List;

public class Treeproperty {
    private String title;
    private List children;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List getChildren() {
        return children;
    }

    public void setChildren(List children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "Treeproperty{" +
                "title='" + title + '\'' +
                ", children=" + children +
                '}';
    }
}
