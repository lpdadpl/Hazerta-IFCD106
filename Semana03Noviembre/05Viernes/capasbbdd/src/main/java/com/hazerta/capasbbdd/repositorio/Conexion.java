package com.hazerta.capasbbdd.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    //Atributo
    protected Connection miConexion;

    //Métodos
    public void abrirConexion() throws ClassNotFoundException, SQLException {
        Class.forName("org.postgresql.Driver");
        miConexion = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/northwind",
                "postgres",
                "a"
        );
        System.out.println("Conexión abierta con éxito.");
    }
    public void cerrarConexion() throws SQLException {
        if (miConexion != null && !miConexion.isClosed()) {
            miConexion.close();
            System.out.println("Conexión cerrada con éxito.");
        }
    }

}
