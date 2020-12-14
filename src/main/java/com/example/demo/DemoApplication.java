package com.example.demo;

import com.example.TestComponentScanController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@ComponentScan(basePackages = "com.example")//加载com.example包下的类
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public TestComponentScanController testComponentScanController(){
        return new TestComponentScanController();
    }

}
