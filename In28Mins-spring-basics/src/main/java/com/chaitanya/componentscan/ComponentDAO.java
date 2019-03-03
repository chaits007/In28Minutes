package com.chaitanya.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentDAO {

	private static Logger LOGGER = LoggerFactory.getLogger(ComponentDAO.class);

	@Autowired
	ComponentJDBCConnection componentJDBCConnection;

	public ComponentJDBCConnection getComponentJDBCConnection() {
		return componentJDBCConnection;
	}

	public void setComponentJDBCConnection(ComponentJDBCConnection componentJDBCConnection) {
		this.componentJDBCConnection = componentJDBCConnection;
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("ComponentDAO postConstruct!");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("ComponentDAO preDestroy!");
	}
}
