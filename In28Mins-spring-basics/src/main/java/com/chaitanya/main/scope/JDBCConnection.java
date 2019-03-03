package com.chaitanya.main.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class JDBCConnection {

	private static Logger LOGGER = LoggerFactory.getLogger(PersonDAO.class);

	public JDBCConnection() {
		System.out.println("JDBC Connection!");
		// TODO Auto-generated constructor stub
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("JDBCConnection postConstruct!");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("JDBCConnection preDestroy!");
	}
}
