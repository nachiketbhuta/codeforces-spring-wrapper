package com.example.codeforces.models;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "codeforces")
@Data
public class CodeforcesSecrets {
    private String key;
    private String secret;
    private String random;
}
