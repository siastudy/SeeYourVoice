package com.voice.web.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable {

    private Integer id;

    private String userid;

    private String username;

    private String passcode;

    private Date createtime;

    private String createby;

    private Date updatetime;

    private String updateby;

}