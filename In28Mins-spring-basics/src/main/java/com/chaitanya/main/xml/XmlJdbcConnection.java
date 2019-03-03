package com.chaitanya.main.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlJdbcConnection {

	private static Logger LOGGER = LoggerFactory.getLogger(XmlJdbcConnection.class);

	public XmlJdbcConnection() {
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
