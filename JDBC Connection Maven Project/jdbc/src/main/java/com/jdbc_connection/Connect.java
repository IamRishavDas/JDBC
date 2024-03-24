package com.jdbc_connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class Connect {
                        //connectior name: databse : address of the database : the target database
    private String url = "jdbc:mysql://localhost:3306/new_database";
    private String user = "root";
    private String password = "rootp@$$?0RD";

    public Connect(String query) throws Exception{
        // Class.forName("com.mysql.jdbc.Driver"); --> depriciated driver loading

        Connection connection = DriverManager.getConnection(url, user, password);
        Statement statement = connection.createStatement();
        
        // fetching the data using execute Query
        
        ResultSet result = statement.executeQuery(query);
        // result.next();

        // while (result.next()) {
        //     System.out.println(result.getString("name"));
        // }

        while(result.next()){
            System.out.println(result.getInt(1) + " : " + result.getString(2));
        }

        // String name = result.getString("name");
        // System.out.println(name);

        // updating the table using execute update Query

        // int count = statement.executeUpdate(query);
        // System.out.println(count + " rows are affected after update!");

        statement.close();
        connection.close();
        
    }
}
