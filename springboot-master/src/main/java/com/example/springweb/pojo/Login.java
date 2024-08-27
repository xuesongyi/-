package com.example.springweb.pojo;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Login {
    private int id;
    private String email;
    private String password;
    private String salt;

    //有效时间
    private LocalDateTime validation_time;

    //是否可用 0不可用 1可用
    private int is_valid;

    //验证码
    private String confirm_code;
}
