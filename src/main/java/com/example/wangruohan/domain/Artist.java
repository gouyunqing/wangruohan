package com.example.wangruohan.domain;

import lombok.Data;

import java.util.Date;

@Data
public class Artist {

    private int id;
    private String name;
    private String stageName;
    private Date birthday;
    private String gender;
    private byte[] picture;
}
