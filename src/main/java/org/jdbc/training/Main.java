package org.jdbc.training;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
  public static void main(String[] args) {
    // Step 1: Load the JDBC Driver
    try {
      Class.forName("org.postgresql.Driver");
    } catch (ClassNotFoundException e) {
      System.out.println("PostgreSQL JDBC Driver not found.");
      e.printStackTrace();
      return;
    }

    // Step 2: Define Database URL
    String url = "jdbc:postgresql://localhost:5432/mydatabase";

    // Step 3: Create Connection
    try {
      Connection connection = DriverManager.getConnection(url, "myuser", "mypassword");
      System.out.println("Connected to PostgreSQL database!");

      // Use the 'connection' object for database operations

      // Don't forget to close the connection when done
      connection.close();
    } catch (SQLException e) {
      System.out.println("Connection to PostgreSQL database failed.");
      e.printStackTrace();
    }
  }
}