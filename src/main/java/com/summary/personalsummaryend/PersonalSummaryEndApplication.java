package com.summary.personalsummaryend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.summary.personalsummaryend.mapper")
public class PersonalSummaryEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalSummaryEndApplication.class, args);
    }

}
