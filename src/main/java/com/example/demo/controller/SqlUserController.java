package com.example.demo.controller;

import com.example.demo.entity.SqlUser;
import com.example.demo.mapper.SqlUserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("数据库用户")
@RestController
@RequestMapping("/sqlUser")
public class SqlUserController {

    @Autowired
    SqlUserMapper sqlUserMapper;

    @ApiOperation("查找数据库用户列表")
    @GetMapping("/findUser/{name}")
    public SqlUser findUser(@PathVariable String name) {
        SqlUser byName = sqlUserMapper.findByName(name);
        return byName;
    }

    @ApiOperation("查找用户列表")
    @GetMapping("/insert/{name}")
    public void insert(@PathVariable String name, @PathVariable Integer age) {
        sqlUserMapper.insert(name, age);
    }


}
