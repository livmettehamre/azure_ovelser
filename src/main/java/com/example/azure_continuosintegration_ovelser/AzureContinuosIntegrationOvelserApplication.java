package com.example.azure_continuosintegration_ovelser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
public class AzureContinuosIntegrationOvelserApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzureContinuosIntegrationOvelserApplication.class, args);
    }

    @GetMapping("/")
    public String helloWorld(@RequestParam(defaultValue = "Cloud") String name) {
        return "Hello " + name;
    }

    @GetMapping("/user-agent")
    public String userAgent(HttpServletRequest request) {
        return request.getHeader("User-Agent");
    }

}
