package com.deliverytech.delivery_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    // A record to define the structure of the /info response
    public record AppInfo(String application, String version, String author, String javaVersion, String framework) {}

    @GetMapping("/health")
    public String health() {
        // Using a Text Block for a multi-line JSON string
        return """
                {
                    "status": "UP",
                    "timestamp": "%s",
                    "javaVersion": "%s"
                }
               """.formatted(java.time.ZonedDateTime.now(), System.getProperty("java.version"));
    }

    @GetMapping("/info")
    public AppInfo info() {
        // Creating and returning a new AppInfo object, which Spring will convert to JSON
        return new AppInfo(
            "Delivery Tech API",
            "1.0.0",
            "Daniel Chaves", // Remember to change to your name
            "JDK 21+",
            "Spring Boot 3.x"
        );
    }
}// Final test