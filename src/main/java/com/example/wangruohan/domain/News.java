package com.example.wangruohan.domain;

import lombok.Data;

import java.util.Date;


@Data
public class News {
    private int id;
    private String title;
    private Date date;
    private String author;
    private String text;
}
