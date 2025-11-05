package com.hazerta.presentacion;

import com.hazerta.modelo.Producto;
import com.hazerta.persistencia.AcessoProductos;

import java.sql.SQLException;
import java.util.List;

public class Inicio
{
    public static void main(String[] args) {
        System.out.println("aplicacion iniciada");
        AcessoProductos ap = new AcessoProductos();

        try {
            List<Producto> productos = ap.obtenerProductos();
            for(Producto p : productos){
                System.out.println(p.toString());
            }
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e.toString() );
        }
    }
}
