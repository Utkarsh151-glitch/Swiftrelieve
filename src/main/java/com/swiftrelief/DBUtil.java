package com.swiftrelief;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * Opens MySQL connections. Settings come from environment variables so no credentials live in the code:
 * SWIFTRELIEF_DB_URL, SWIFTRELIEF_DB_USER, SWIFTRELIEF_DB_PASSWORD.
 */
public class DBUtil {
    private static final String DEFAULT_URL =
            "jdbc:mysql://localhost:3306/swiftrelief_db?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC";

    private static String env(String name, String fallback) {
        String value = System.getenv(name);
        return (value == null || value.isBlank()) ? fallback : value;
    }

    public static Connection getConnection() throws SQLException {
        System.out.println("[DBUtil] Connecting to database...");
        return DriverManager.getConnection(
                env("SWIFTRELIEF_DB_URL", DEFAULT_URL),
                env("SWIFTRELIEF_DB_USER", "root"),
                env("SWIFTRELIEF_DB_PASSWORD", ""));
    }
}
