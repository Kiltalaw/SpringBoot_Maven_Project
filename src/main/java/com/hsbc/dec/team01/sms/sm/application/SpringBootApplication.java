package com.hsbc.dec.team01.sms.sm.application;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

/**
 * @Author:Kiltalaw
 * @Description:
 * @Date:2018/7/30 11:30
 * @Modify:
 **/
@EnableAutoConfiguration
public class SpringBootApplication {
    public static void main(String[] args)throws Exception{
        SpringApplication.run(SpringBootApplication.class,args) ;
    }
}
