package com.chaitanya.main.scope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@Resource
public class PersonDAO {

	private static Logger LOGGER = LoggerFactory.getLogger(PersonDAO.class);

	@Autowired
	JDBCConnection jdbcConnection;

	public JDBCConnection getJdbcConnection() {
		return jdbcConnection;
	}

	public void setJdbcConnection(JDBCConnection jdbcConnection) {
		this.jdbcConnection = jdbcConnection;
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
