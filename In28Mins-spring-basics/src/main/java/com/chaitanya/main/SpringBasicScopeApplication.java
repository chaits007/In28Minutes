package com.chaitanya.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.chaitanya.main.scope.PersonDAO;

@Configuration
@ComponentScan
public class SpringBasicScopeApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicScopeApplication.class);

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
				SpringBasicScopeApplication.class)) {

			PersonDAO personDAO1 = applicationContext.getBean(PersonDAO.class);
			PersonDAO personDAO2 = applicationContext.getBean(PersonDAO.class);

			LOGGER.info("{}", personDAO1);
			LOGGER.info("{}", personDAO1.getJdbcConnection());
			LOGGER.info("{}", personDAO2);
			LOGGER.info("{}", personDAO2.getJdbcConnection());
		}
	}
}