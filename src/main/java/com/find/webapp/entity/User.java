package com.find.webapp.entity;

import java.io.Serializable;

/**
 * Created by User on 2017/3/6.
 */
public class User implements Serializable{
    private Long id;
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
