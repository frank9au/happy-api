package com.happy;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan("com.happy.**.mapper")
public class HappyApiApplication {

    public static void main(String[] args) {
        try {
            SpringApplication.run(HappyApiApplication.class, args);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
