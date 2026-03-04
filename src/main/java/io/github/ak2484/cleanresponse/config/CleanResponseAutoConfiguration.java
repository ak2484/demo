package io.github.ak2484.cleanresponse.config;

import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@AutoConfiguration
@EnableConfigurationProperties(CleanResponseProperties.class)
public class CleanResponseAutoConfiguration {
}