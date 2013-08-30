package com.steel.Log4j;

import org.apache.log4j.Logger;


public class Log4jDemo {

	public static void main(String[] args) {
		Logger logger = Logger.getLogger(Log4jDemo.class);
		logger.debug("------------------------------->DEBUG");
		logger.info("-------------------------------->INFO");
		logger.warn("-------------------------------->WARN");
		logger.error("-------------------------------->ERROR");
	}
}
