package com.gdy.graduate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest
class GraduateApplicationTests {
    @Autowired//自动配置
    private DataSource dataSource;

    @Test
    void contextLoads() {
    }
     /*
     org.postgresql.jdbc.PgConnection@107bfcb2
      */
    @Test
    void getConnection() throws SQLException {
        System.out.println(dataSource.getConnection());
    }
}
