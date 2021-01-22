package com.bean;

import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {
    private static Connection conn;
    private static Statement stmt;
    private static String driverClass;
    private static String url;
    private static String userName;
    private static String password;

//    public void readConfig() throws IOException{
//        System.out.println("执行到这来了");
//        InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("/jdbc.properties");
//        Properties pro = new Properties();
//        pro.load(in);
//        driverClass = pro.getProperty("driver");
//        url = pro.getProperty("url");
//        userName = pro.getProperty("username");
//        password = pro.getProperty("password");
//        System.out.println(driverClass);
//        System.out.println(url);
//        System.out.println(userName);
//        System.out.println(password);
//    }

    public void open()
    {
        try
        {
            InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("/jdbc.properties");
            Properties pro = new Properties();
            pro.load(in);
            driverClass = pro.getProperty("driver");
            url = pro.getProperty("url");
            userName = pro.getProperty("user");
            password = pro.getProperty("password");
            Class.forName(driverClass);
            conn=DriverManager.getConnection(url,userName,password);
            stmt=conn.createStatement();
        }
        catch (Exception ex)
        {
            System.err.println( ex.getMessage());
        }
    }
    public void close()
    {
        try
        {
            conn.close();
        }
        catch (SQLException ex)
        {
            System.err.println( ex.getMessage());
        }
    }
    public ResultSet executeQuery(String sql) throws SQLException
    {
        ResultSet rs = null;
        rs = stmt.executeQuery(sql);
        return rs;
    }
    public int executeUpdate(String sql) throws SQLException
    {
        int ret = 0;
        ret = stmt.executeUpdate(sql);
        return ret;
    }
}
