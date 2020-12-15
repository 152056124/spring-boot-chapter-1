package com.example.demo.mapper;

import com.example.demo.entity.SqlUser;
import org.apache.ibatis.annotations.Param;

public interface SqlUserMapper {

    SqlUser findByName(@Param("name") String name);

    int insert(@Param("name") String name, @Param("age") Integer age);
}
