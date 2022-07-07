package com.woldier;

import com.woldier.auth.auth.server.EnableAuthServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAuthServer
public class JwtApplication {
    public static void main(String[] args) {
        SpringApplication.run(JwtApplication.class,args) ;
    }
}
