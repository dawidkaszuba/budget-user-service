package pl.dawidkaszuba.user.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "user-service")
@Getter
@Setter
@ToString
public class UserServiceConfig {
    private String msg;
    private String buildVersion;
}
