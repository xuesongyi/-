package com.example.springweb.pojo;

import lombok.Data;

@Data
public class Course {
    private int couId;
    //课程名称
    private String couName;
    //学分
    private int couGrade;
    //学时
    private int couTime;
    //所属专业
    private String major;
}
