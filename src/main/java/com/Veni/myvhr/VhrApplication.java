package com.Veni.myvhr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author PaiMon
 * @program: MyVhr
 * @description: 启动类
 */
@SpringBootApplication
@EnableCaching
@MapperScan(basePackages = "com.Veni.myvhr.mapper")
@EnableScheduling
public class VhrApplication {
    public static void main(String[] args) {
        SpringApplication.run(VhrApplication.class, args);
    }

}
