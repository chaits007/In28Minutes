package com.chaitanya.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.chaitanya.main.properties.ExternalServiceUrl;

@Configuration
@ComponentScan
@PropertySource("classpath:app.properties")
public class SpringBasicPropertiesApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicPropertiesApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBasicPropertiesApplication.class)) {

			ExternalServiceUrl externalServiceUrl = applicationContext.getBean(ExternalServiceUrl.class);

			LOGGER.info("External Url -> {}", externalServiceUrl.getUrl());
		}
	}
}