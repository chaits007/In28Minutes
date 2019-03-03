package com.chaitanya.main.xml;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class XmlPersonDAO {

	private static Logger LOGGER = LoggerFactory.getLogger(XmlPersonDAO.class);

	XmlJdbcConnection xmlJdbcConnection;

	public XmlJdbcConnection getXmlJdbcConnection() {
		return xmlJdbcConnection;
	}

	public void setXmlJdbcConnection(XmlJdbcConnection xmlJdbcConnection) {
		this.xmlJdbcConnection = xmlJdbcConnection;
	}

	@PostConstruct
	public void postConstruct() {
		LOGGER.info("PersonDAO postConstruct!");
	}

	@PreDestroy
	public void preDestroy() {
		LOGGER.info("PersonDAO preDestroy!");
	}
}
