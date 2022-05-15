package com.example.apartment;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconnection {
    public Connection databaseLink;

    public Connection getConnection(){
        String databaseName = "login_db";
        String databaseUser = "login";
        String databasePassword = "putyourpasswordhere";
        String url = "jdbc:mysql://localhost/"+ databaseName;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url,databaseUser,databasePassword);

        }catch (Exception e){
            e.printStackTrace();
            e.getCause();
        }
        return databaseLink;

    }

}
