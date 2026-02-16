package com.jdbcPractice.databaseConnectivity;

import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

//	Connection with Parameters 

public class DatabaseConfig {
	private static final Dotenv DOTENV = Dotenv.configure().ignoreIfMissing().load();

	public static Connection getConnection() throws SQLException {
		String url = getRequiredEnv("DB_URL");
		Properties properties = new Properties();
		properties.setProperty("user", getRequiredEnv("DB_USER"));
		properties.setProperty("password", getRequiredEnv("DB_PASS"));
		properties.setProperty("useSSL", "false");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		return DriverManager.getConnection(url, properties);
	}
	
	public static void main(String[] args) throws SQLException {
		Connection conn = getConnection();
		System.out.println(conn != null);
	}

	private static String getRequiredEnv(String key) {
		String value = DOTENV.get(key);
		if (value == null || value.isBlank()) {
			throw new IllegalStateException("Missing required environment variable: " + key);
		}
		return value;
	}
}