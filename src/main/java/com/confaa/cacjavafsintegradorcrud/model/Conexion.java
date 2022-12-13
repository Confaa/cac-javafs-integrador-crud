package com.confaa.cacjavafsintegradorcrud.model;


import javax.sql.*;
import java.sql.Connection;
import java.sql.SQLException;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {

    private static final String URL_DB = "jdbc:mysql://@localhost:3306/cac?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private static BasicDataSource dataSource;

    public Conexion() {
    }

    public static DataSource getDataSource() {
        if (dataSource == null) {
            try {
                dataSource = new BasicDataSource();
                dataSource.setUrl(URL_DB);
                dataSource.setUsername("root");
                dataSource.setPassword("1234");
                dataSource.setInitialSize(50);
            } catch (Exception ex) {
                throw new RuntimeException(
                        "Error de E/S al leer config de BBDD", ex);
            }
        }
        return dataSource;
    }

    public static Connection getConnection() throws SQLException {
        return getDataSource().getConnection();
    }

}
