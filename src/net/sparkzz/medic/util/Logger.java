package net.sparkzz.medic.util;

import java.util.logging.Level;

/**
 * Created by Brendon on 9/24/2014.
 */
public class Logger {

	private java.util.logging.Logger logger;
	private String name;

	public Logger(String name) {
		this.name = name;
	}

	public void log(Level level, String message) {
		logger.log(level, "[" + this.name + "] " + message);
	}

	public void info(String message) {
		logger.log(Level.INFO, "[" + this.name + "] " + message);
	}

	public void severe(String message) {
		logger.log(Level.SEVERE, "[" + this.name + "] " + message);
	}

	public void warn(String message) {
		logger.log(Level.WARNING, "[" + this.name + "] " + message);
	}
}