package com.leo.demo;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
        System.out.println("-----测试完毕-------");
    }

    @Test
    public void testMysqlConnect() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (Exception ex) {
            System.out.println("无法加在驱动");
        }
        try {

            Connection conn = (Connection) DriverManager.getConnection(
                    "jdbc:mysql://47.104.142.106:3307/demoDb?characterEncoding=utf-8&useSSL=false", "root", "010407");
            System.out.println("数据库连接成功");
            if (!conn.isClosed())
                System.out.println("success");
        } catch (Exception ex) {
            System.out.println("数据库连接失败");
        }
    }
}
