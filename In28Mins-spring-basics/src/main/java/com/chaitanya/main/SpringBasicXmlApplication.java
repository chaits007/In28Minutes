package com.chaitanya.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.chaitanya.main.xml.XmlPersonDAO;

public class SpringBasicXmlApplication {

	private static Logger LOGGER = LoggerFactory.getLogger(SpringBasicXmlApplication.class);

	public static void main(String[] args) {
		try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"applicationcontext.xml")) {

			LOGGER.info("Created Beans -> {}", (Object) applicationContext.getBeanDefinitionNames());

			XmlPersonDAO personDAO1 = applicationContext.getBean(XmlPersonDAO.class);

			LOGGER.info("{}", personDAO1);
			LOGGER.info("{}", personDAO1.getXmlJdbcConnection());
		}
	}
}