package com.mysql.example;

import java.sql.*;

public class Main {
    public static void main(String[] args)
    {
        try
        {
            Connection conn =
                    DriverManager.getConnection("jdbc:mysql://localhost:3306/university", "root", "password_here");
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT name FROM instructor");
            while(rs.next())
            {
                System.out.println(rs.getString("name"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e);
        }

        System.out.println("It worked!");
        try { System.in.read(); } // This makes the terminal stall, waiting for an enter input, so it can be viewed.
        catch(Exception e)
        {
            System.out.println("What even happened here");
        }
    }
}