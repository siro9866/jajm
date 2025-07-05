package com.sil.jajm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@MapperScan("com.sil.jajm.domain.**.mapper")
public class JajmApplication {

    public static void main(String[] args) {
        SpringApplication.run(JajmApplication.class, args);
    }

}
