package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 该类不与启动类DemoApplication同级
 * 所以正常情况下，加载不到这个类
 * 如果需要被加载到，则在启动类上添加注解如下：
 *      @ComponentScan(basePackages = "com.example")
 * 或者使用@Bean在启动类中初始化：
 *     @Bean
 *     public TestComponentScanController testComponentScanController(){
 *         return new TestComponentScanController();
 *     }
 */
@RestController
@RequestMapping("/testComponentScan")
public class TestComponentScanController {

    @GetMapping("/hello")
    public String index() {
        return "ComponentScan Hello World";
    }
}
