package com.yxm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@MapperScan("com.yxm.web.dao")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println(args);
        SpringApplication.run(App.class, args);
    }
}
