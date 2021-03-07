package com.company.subtask1;
import java.sql.*;
public class Database {
    private static Database instance;

    private Database(){

    }
    public static Database getInstance(){
        if(instance==null){
            instance=new Database();
        }
        return instance;
    }
    public void query(String sqlquery){
        String connectionUrl="jdbc:postgresql://localhost:5432/DataforJava";
        Connection connection=null;
        ResultSet  resultSet=null;
        Statement statement=null;
        try {
            Class.forName("org.postgresql.Driver");
            connection=DriverManager.getConnection(connectionUrl,"postgres","magauiyainc");
            statement=connection.createStatement();
            resultSet=statement.executeQuery(sqlquery);
            while(resultSet.next()){
                System.out.println(resultSet.getInt("id")+" "+resultSet.getString("name")+" "+resultSet.getString("surname"));
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
    }


