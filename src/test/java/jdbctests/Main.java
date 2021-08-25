package jdbctests;

import java.net.ConnectException;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String dbUrl="jdbc:oracle:thin:@52.87.154.190:1521:xe";
        String dbUsername="hr";
        String dbPassword="hr";

     //create connection
        Connection connection = DriverManager.getConnection(dbUrl,dbUsername,dbPassword);
      //  create statement object
        Statement statement = connection.createStatement();
      //  run quaery and get the result in resultset object
        ResultSet resultSet = statement.executeQuery("select first_name,last_name,salary from employees");

//      //move pointer to first row
//      resultSet.next();
//        System.out.println(resultSet.getString("region_name"));
//        System.out.println(resultSet.getString(2));
//
//      //move pointer to second row
//        resultSet.next();
//        //getting information with column name
//        System.out.println(resultSet.getString("region_name"));
//        System.out.println(resultSet.getString(2));
//
//        System.out.println(resultSet.getString(1)+" - " + resultSet.getString("region_name"));
//
//        //move pointer to second row
//        resultSet.next();
//        System.out.println(resultSet.getString(1)+" - " + resultSet.getString("region_name"));

        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+" - " + resultSet.getString(2)+" - "+resultSet.getString(3));

        }








        //close all connections
        resultSet.close();
        statement.close();
        connection.close();

    }

}
