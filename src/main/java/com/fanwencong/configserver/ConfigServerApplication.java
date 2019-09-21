package com.fanwencong.configserver;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
@SpringBootApplication
@EnableConfigServer
public class ConfigServerApplication {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        SpringApplication.run(ConfigServerApplication.class, args);
        log.info("===========Started ConfigServer successfully in {} seconds =============",(System.currentTimeMillis()-start)/1000);

    }

}
