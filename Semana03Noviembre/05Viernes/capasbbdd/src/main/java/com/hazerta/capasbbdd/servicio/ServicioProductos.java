package com.hazerta.capasbbdd.servicio;


import com.hazerta.capasbbdd.modelo.Producto;
import com.hazerta.capasbbdd.repositorio.AccesoProductos;
import com.hazerta.capasbbdd.repositorio.IAcessoProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.util.List;

@Service
public class ServicioProductos implements IServicioProductos{

    @Autowired
    private AccesoProductos accesoProductos;

    public List<Producto> obtenerTodos() throws Exception {
        return accesoProductos.obtenerProducto();
    }

    @Override
    public List<Producto> obtenertodos() throws Exception {
        return List.of();
    }
}
