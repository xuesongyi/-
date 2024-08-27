package com.example.springweb.pojo;

import lombok.Data;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Data
@Validated
public class Dorm {

    //宿舍id
    private int dormId;
    @NotBlank(message = "宿舍号必须填写")
    @Pattern(regexp = "[0-9]{3}",message = "宿舍号必须按照‘001’的格式填写")
    private String dormNum;
    @NotBlank(message = "宿舍地址必须填写")
    @Pattern(regexp = "[\u4e00-\u9fa5]{4}",message = "宿舍地址必须按照‘十四公寓’的格式填写")
    private String dormAddress;
}
