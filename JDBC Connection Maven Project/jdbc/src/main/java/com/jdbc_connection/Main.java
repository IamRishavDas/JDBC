package com.jdbc_connection;

public class Main {
    public static void main(String[] args) throws Exception {
        String query = "select * from new_table;";
        // String query = "insert into new_table values(6,\"abc\",\"126746334\")";
        new Connect(query);
    }
}