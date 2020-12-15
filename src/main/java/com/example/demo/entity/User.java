package com.example.demo.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.*;

@ApiModel(description = "用户实体")
@Data
public class User {

    @ApiModelProperty("用户编号")
    private Long id;

    @ApiModelProperty("用户姓名")
    private String name;

    @NotNull
    @Max(100)
    @Min(10)
    @ApiModelProperty("用户年龄")
    private Integer age;


    @Email
    @ApiModelProperty("用户邮箱")
    private String email;
}
