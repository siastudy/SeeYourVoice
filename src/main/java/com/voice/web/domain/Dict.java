package com.voice.web.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Dict implements Serializable {

    private Integer id;

    private String keyname;

    private String keyvalue;

    private String keygroup;

    private Date createat;

    private String createby;

    private Date updateat;

    private String updateby;
}