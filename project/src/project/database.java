package project;

import java.sql.Connection;
import java.sql.DriverManager;

public class database 
{
    public static Connection connect() 
    {
        try 
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost/data", "root", "");
            return connect;
        } catch (Exception e) 
        {
            e.printStackTrace();
        }
        return null;
    }
}
