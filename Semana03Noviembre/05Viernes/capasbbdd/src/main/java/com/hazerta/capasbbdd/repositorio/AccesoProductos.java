package com.hazerta.capasbbdd.repositorio;

import com.hazerta.capasbbdd.modelo.Producto;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



@Repository
public class AccesoProductos extends Conexion implements IAcessoProductos{



    @Override
    public List<Producto> obtenerProducto() throws SQLException, ClassNotFoundException {
        //1, Declarar variables
        Statement sentencia;
        ResultSet rejilla;
        List<Producto> listaProductos = new ArrayList<>();
        String sql = "SELECT product_id, product_name FROM products";
        //2, Abrir conexión
        abrirConexion();
        //3, Crear sentencia
        sentencia = miConexion.createStatement();
        //4, Ejecutar sentencia
        rejilla = sentencia.executeQuery(sql);
        //5, Procesar resultados
        while (rejilla.next()) {
            Producto p = new Producto();
            p.setId(rejilla.getInt("product_id"));
            p.setNombre(rejilla.getString("product_name"));
            listaProductos.add(p);
    }
        //6, Cerrar conexión
        cerrarConexion();
        //7, Devolver resultados
        return listaProductos;
    }


}
