package com.chaitanya.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chaitanya.componentscan.ComponentDAO;

@Configuration
@ComponentScan("com.chaitanya.componentscan")
public class SpringBasicComponentScanApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicComponentScanApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBasicScopeApplication.class)) {

			ComponentDAO componentDAO = applicationContext.getBean(ComponentDAO.class);

			LOGGER.info("{}", componentDAO);
		}
	}
}