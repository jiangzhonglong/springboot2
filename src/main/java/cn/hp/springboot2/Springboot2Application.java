package cn.hp.springboot2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("cn.hp.springboot2.mapper")
@SpringBootApplication
public class Springboot2Application {

    public static void main(String[] args) {
        SpringApplication.run(Springboot2Application.class, args);
    }

}
