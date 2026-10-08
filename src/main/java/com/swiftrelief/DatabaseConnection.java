package com.swiftrelief;

import java.sql.Connection;
import java.sql.SQLException;

/** Kept for the DAOs that already call it; uses the same environment-based settings as {@link DBUtil}. */
public class DatabaseConnection {
    public static Connection getConnection() throws SQLException {
        return DBUtil.getConnection();
    }
}
