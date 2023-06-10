package com.family.lsky.modul;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName BaseMessage
 * @Date 2023-06-10 10:05
 * @AUTHOR family
 **/
@Configuration
@ConfigurationProperties(prefix = "lsky")
@Data
public class BaseMessage {
    private String baseUrl;
    private String email;
    private String password;
    private String authorization;
}
