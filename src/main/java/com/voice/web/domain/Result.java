package com.voice.web.domain;

import lombok.Data;

import java.io.Serializable;

@Data
public class Result implements Serializable {

    private Integer id;

    private String fileid;

    private String userid;

    private String textresult;

    private String convengine;

    private String resultversion;

}