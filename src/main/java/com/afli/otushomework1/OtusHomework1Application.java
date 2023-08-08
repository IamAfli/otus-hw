package com.afli.otushomework1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
        "com.afli"
})
public class OtusHomework1Application {

    public static void main(String[] args) {
        SpringApplication.run(OtusHomework1Application.class, args);
    }

}
