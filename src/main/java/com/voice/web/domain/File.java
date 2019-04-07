package com.voice.web.domain;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
public class File implements Serializable {

    private Integer id;

    private String fileid;

    private String filename;

    private String rawfilepath;

    private String readyfilepath;

    private Date gentime;

    private String fileformat;

    private Integer filesize;

    private String isconverted;

    private String md5value;

    private String filebelong;

    private String isdelete;

    private Date createtime;

    private String createby;

    private Date updatetime;

    private String updateby;

}