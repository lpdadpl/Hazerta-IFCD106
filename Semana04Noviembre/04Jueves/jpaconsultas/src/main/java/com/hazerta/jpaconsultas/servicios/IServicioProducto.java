package com.hazerta.jpaconsultas.servicios;

import com.hazerta.jpaconsultas.modelo.Producto;

import java.util.List;

public interface IServicioProducto {
    List<Producto> listarProducto();
    Producto listarProductoPorId(int id);
    Producto guardarProducto(Producto producto);
    Producto actualizarProducto(Producto producto);
    void eliminarProducto(int id);
    List<Producto> listarProductosPorNombre(String nombre);
    List<Producto> listarProductoPorPatron(String patron);
    List<Producto> listarProductoPorCategoria(int category_id);
    List<Producto> obtenerProductoPorPatronsql(String patron);

}

