package com.fab.algo.pool;

import com.mchange.v2.c3p0.DataSources;

import javax.sql.DataSource;
import java.lang.reflect.Field;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @Author: yanbl
 * @Description:
 * @Date: Created in 3:56 PM 2020/6/15
 * @Modified:
 */
public class Main {


    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");

        DataSource unpooled = DataSources.unpooledDataSource("jdbc:mysql://127.0.0.1/vcard", "root", "root123");
        DataSource polled = DataSources.pooledDataSource(unpooled);
        Connection con = null;
        Statement stmt = null;
        ResultSet rs = null;


        con = polled.getConnection();
        System.out.println("con Class Type is:" + con.getClass().getName());
        Object o1 = getInnter(con);
        System.out.println("Inner con Class Type is：" + o1.getClass().getName());

        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from user");
        while (rs.next()) {
            System.out.println("Data from DB:" + rs.getString(1));
        }
        rs.close();
        stmt.close();
        con.close();

        Thread.sleep(1000);


        con = polled.getConnection();
        Object o2 = getInnter(con);
        if (o1 == o2) {
            System.out.println("o1 and o2 is same object");
        }
        stmt = con.createStatement();
        rs = stmt.executeQuery("select * from user");
        while (rs.next()) {
            System.out.println("Data from DB:" + rs.getString(1));
        }
        rs.close();
        stmt.close();
        con.close();

    }

    public static Object getInnter(Object con) {
        Object re = null;
        Field f;
        try {
            f = con.getClass().getDeclaredField("inner");
            f.setAccessible(true);
            re = f.get(con);
            f.setAccessible(false);
        } catch (Exception e) {

        }
        return re;
    }
}
