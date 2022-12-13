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
    private static final String GET_ANIMAL_QUERY = "SELECT * FROM animales WHERE idAnimal = ?";
    private static final String GET_UPDATE_ANIMAL_QUERY = "UPDATE animales SET especie=?, nombre=?,raza=?, nacimiento=? WHERE idAnimal=?";

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
        Animal animal = null;

        try (Connection con = Conexion.getConnection(); PreparedStatement ps = con.prepareStatement(
                GET_ANIMAL_QUERY);) {
            ps.setInt(1, id);
            try (ResultSet rs = ps.executeQuery();) {
                rs.next();
                animal = rsToAnimal(rs);
            } catch (SQLException e) {
                throw new RuntimeException("Error de SQL", e);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener animal por ID", e);
        }

        return animal;
    }

    @Override
    public int addAnimal(Animal animal) {
        return 0;
    }

    @Override
    public int updateAnimal(Animal animal) {
        try (Connection con = Conexion.getConnection(); PreparedStatement ps = con.prepareStatement(
                GET_UPDATE_ANIMAL_QUERY);) {
            ps.setString(1, animal.getEspecie());
            ps.setString(2, animal.getNombre());
            ps.setString(3, animal.getRaza());
            ps.setString(4, animal.getNacimiento());
            ps.setInt(5, animal.getIdAnimal());
            int rs = ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Error de SQL", e);
        } catch (Exception e) {
            throw new RuntimeException("Error al intentar actualizar el animal",
                                       e);
        }

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
        String nacimiento = resultSet.getString("nacimiento");
        String foto = resultSet.getString("foto");
        return new Animal(id, nombre, especie, raza, nacimiento, foto);
    }
}



