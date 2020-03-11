package com.leyou;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import sun.applet.Main;

@SpringBootApplication
@EnableEurekaServer
public class LeyouDiscoveryApplication {
    public static void main(String[] args) {
        SpringApplication.run(LeyouDiscoveryApplication.class);
    }
}
