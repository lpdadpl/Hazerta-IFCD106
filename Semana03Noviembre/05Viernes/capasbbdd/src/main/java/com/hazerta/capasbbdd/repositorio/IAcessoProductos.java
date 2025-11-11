package com.hazerta.capasbbdd.repositorio;

import com.hazerta.capasbbdd.modelo.Producto;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface IAcessoProductos {
    List<Producto> obtenerProducto() throws Exception;
}
