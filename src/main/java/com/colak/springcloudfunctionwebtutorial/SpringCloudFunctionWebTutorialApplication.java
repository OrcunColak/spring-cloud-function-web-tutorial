package com.colak.springcloudfunctionwebtutorial;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
@Slf4j
public class SpringCloudFunctionWebTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudFunctionWebTutorialApplication.class, args);
    }

    // http://localhost:8080/toUpper/test
    @Bean
    public Function<String, String> toUpper() {
        return str -> {
            log.info(STR."Original: \{str}");
            return str.toUpperCase();
        };
    }
}
