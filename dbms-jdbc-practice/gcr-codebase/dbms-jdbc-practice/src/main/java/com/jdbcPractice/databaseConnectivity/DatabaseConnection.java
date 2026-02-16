package com.jdbcPractice.databaseConnectivity;
//	 Basic Connection 
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	// Database credentials
	private static final Dotenv DOTENV = Dotenv.configure().ignoreIfMissing().load();
	private static final String URL = getRequiredEnv("DB_URL");
	private static final String USER = getRequiredEnv("DB_USER");
	private static final String PASSWORD = getRequiredEnv("DB_PASS");

	public static Connection getConnection() throws ClassNotFoundException {
		Connection connection = null;
		try {
			// Load MySQL JDBC Driver (optional in modern JDBC)
			// Class.forName("com.mysql.cj.jdbc.Driver");

			// Establish connection
			connection = DriverManager.getConnection(URL, USER, PASSWORD);
			System.out.println("Database connected successfully!");
		} catch (SQLException e) {
			System.err.println("Connection failed!");
			e.printStackTrace();
		}
		return connection;
	}

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = getConnection();
		if (conn != null) {
			try {
				conn.close();
				System.out.println("Connection closed.");
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static String getRequiredEnv(String key) {
		String value = DOTENV.get(key);
		if (value == null || value.isBlank()) {
			throw new IllegalStateException("Missing required environment variable: " + key);
		}
		return value;
	}
}