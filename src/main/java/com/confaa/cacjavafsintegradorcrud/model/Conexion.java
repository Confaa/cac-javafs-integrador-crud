package com.confaa.cacjavafsintegradorcrud.model;

import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

public class Conexion {

    private static final String URL_DB = "jdbc:mariadb://root:root@localhost:3306/cac_crud_bd?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";

    private static Connection connection;

    private static BasicDataSource dataSource;

    public Conexion() {
    }

    public static DataSource getDataSource() {
        if (dataSource == null) {
            try {
                dataSource = new BasicDataSource();
                dataSource.setUrl(URL_DB);
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
