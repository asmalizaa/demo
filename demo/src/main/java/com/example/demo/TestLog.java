package com.example.demo;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestLog {

	private static final Logger logger = LogManager.getLogger(TestLog.class);

	public static void main(String[] args) {
//		logger.atLevel(Level.DEBUG);

		logger.trace("Trace Message!");
		logger.debug("Debug Message!");
		logger.info("Info Message!");
		logger.warn("Warn Message!");
		logger.error("Error Message!");
		logger.fatal("Fatal Message!");

	}

}
