package com.example.springweb.pojo;

import lombok.Data;

@Data
public class Grade {
    //学号
    private String stuNumber;

    //课程号
    private int couId;

    //成绩
    private int grade;

    //绩点
    private float point;
    private Student student;
    private Course course;
}
