package com.voice.web.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class Status implements Serializable {

    private Integer id;

    private String filename;

    private String convstatus;

    private Date createat;

    private String createby;

    private Date updateat;

    private String updateby;
}