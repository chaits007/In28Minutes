package com.chaitanya.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chaitanya.main.cdi.SomeCDIBusiness;

@Configuration
@ComponentScan
public class SpringBasiccdiApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasiccdiApplication.class);

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBasiccdiApplication.class)) {

			SomeCDIBusiness someCDIBusiness = applicationContext.getBean(SomeCDIBusiness.class);

			LOGGER.info("{} - {}", someCDIBusiness, someCDIBusiness.getSomeCdiDAO());
		}
	}
}