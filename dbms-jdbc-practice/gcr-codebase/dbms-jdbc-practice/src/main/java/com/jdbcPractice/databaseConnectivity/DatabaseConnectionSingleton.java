package com.jdbcPractice.databaseConnectivity;

//	Database Connection Singleton
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionSingleton {
	private static DatabaseConnectionSingleton instance;
	private Connection connection;
	private static final Dotenv DOTENV = Dotenv.configure().ignoreIfMissing().load();
	private static final String URL = getRequiredEnv("DB_URL");
	private static final String USER = getRequiredEnv("DB_USER");
	private static final String PASSWORD = getRequiredEnv("DB_PASS");

	private DatabaseConnectionSingleton() throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			this.connection = DriverManager.getConnection(URL, USER, PASSWORD);
		} catch (ClassNotFoundException e) {
			throw new SQLException("Database Driver not found", e);
		}
	}

	public static DatabaseConnectionSingleton getInstance() throws SQLException {
		if (instance == null || instance.getConnection().isClosed()) {
			instance = new DatabaseConnectionSingleton();
		}
		return instance;
	}

	public Connection getConnection() {
		return connection;
	}

	private static String getRequiredEnv(String key) {
		String value = DOTENV.get(key);
		if (value == null || value.isBlank()) {
			throw new IllegalStateException("Missing required environment variable: " + key);
		}
		return value;
	}
}