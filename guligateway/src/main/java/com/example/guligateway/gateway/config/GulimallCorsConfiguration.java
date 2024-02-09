package com.example.guligateway.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

/**
 * @author VectorX
 * @version V1.0
 * @date 2024-01-30 11:38:31
 */
@Configuration
public class GulimallCorsConfiguration
{
    @Bean
    public CorsWebFilter corsWebFilter() {
        // 基于url跨域，选择reactive包下的
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();

        CorsConfiguration config = new CorsConfiguration();
        config.addAllowedOriginPattern("*"); // 允许任何来源
        config.addAllowedHeader("*");
        config.addAllowedMethod("*");
        config.setAllowCredentials(true); // 允许携带cookie跨域

        // 任意url都要进行跨域配置
        source.registerCorsConfiguration("/**", config);

        return new CorsWebFilter(source);
    }
}
