package com.example.demo.config;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RestTemplateBeanConfig {

	@Bean
	public RestTemplate restTemplateConfig(RestTemplateBuilder builder) {
		return builder.build();
	}
}
