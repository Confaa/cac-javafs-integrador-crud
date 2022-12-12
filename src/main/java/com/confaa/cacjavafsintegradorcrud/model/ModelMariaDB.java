package com.confaa.cacjavafsintegradorcrud.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class ModelMariaDB implements Model {

    private static final String GET_ALL_ANIMALS_QUERY = "SELECT * FROM animales";
    private static final String GET_ANIMAL_QUERY = "SELECT * FROM animales WHERE id = ?";

    @Override
    public List<Animal> getAnimales() throws ClassNotFoundException {
        List<Animal> animales = new ArrayList<>();
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection con = Conexion.getConnection(); PreparedStatement ps = con.prepareStatement(
                GET_ALL_ANIMALS_QUERY); ResultSet rs = ps.executeQuery();) {

            while (rs.next()) {
                animales.add(rsToAnimal(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error de SQL", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener la lita de animales",
                                       e);
        }
        return animales;
    }

    @Override
    public Animal getAnimal(int id) {
        return null;
    }

    @Override
    public int addAnimal(Animal motor) {
        return 0;
    }

    @Override
    public int updateAnimal(Animal motor) {
        return 0;
    }

    @Override
    public int deleteAnimal(int id) {
        return 0;
    }

    private Animal rsToAnimal(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("idAnimal");
        String especie = resultSet.getString("especie");
        String nombre = resultSet.getString("nombre");
        String raza = resultSet.getString("raza");
        Date nacimiento = resultSet.getDate("nacimiento");
        String foto = resultSet.getString("foto");
        return new Animal(id, nombre, especie, raza, nacimiento, foto);
    }
}



