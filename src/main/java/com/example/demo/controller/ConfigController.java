package com.example.demo.controller;

import com.example.demo.config.CollectionConfig;
import com.example.demo.config.MyConfig;
import com.example.demo.config.RandomConfig;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("配置文件接口")
@RestController
@RequestMapping("/config")
public class ConfigController {
    @Autowired
    private MyConfig myConfig;

    @Autowired
    private RandomConfig randomConfig;

    @Autowired
    private CollectionConfig collectionConfig;

    @GetMapping("/MyConfig")
    public String getMyConfig() {
        String var = "name: " + myConfig.getName() + "\r\n"
                + "sex: " + myConfig.getSex() + "\r\n"
                + "desc: " + myConfig.getDesc();

        return var;
    }

    @GetMapping("/RandomConfig")
    public String getRandomConfig() {
        String var = "RandomInt: " + randomConfig.getRandomInt() + "\r\n "
                + "RandomValue: " + randomConfig.getRandomValue();
        return var;
    }

    @GetMapping("/CollectionConfig")
    public String getCollectionConfig() {
        List<String> propertiesList = collectionConfig.getProperties();
        return propertiesList.toString();
    }
}
