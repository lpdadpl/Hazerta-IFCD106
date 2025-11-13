package com.hazerta.jpaconsultas.servicios;

import com.hazerta.jpaconsultas.modelo.Producto;
import com.hazerta.jpaconsultas.repositorio.IRepositorioProducto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioProductoImpl implements IServicioProducto{

    @Autowired
    private IRepositorioProducto repositorioProducto;

    @Override
    public List<Producto> listarProducto() {
        return repositorioProducto.findAll();
    }

    @Override
    public Producto listarProductoPorId(int id) {
        return repositorioProducto.findById(id).orElse(null);
    }

    @Override
    public Producto guardarProducto(Producto producto) {
        return repositorioProducto.save(producto);
    }

    @Override
    public Producto actualizarProducto(Producto producto) {
        return repositorioProducto.save(producto);
    }

    @Override
    public void eliminarProducto(int id) {
        repositorioProducto.deleteById(id);
    }

    @Override
    public List<Producto> listarProductosPorNombre(String nombre) {
        return repositorioProducto.listarPorNombre(nombre);
    }

    @Override
    public List<Producto> listarProductoPorPatron(String patron) {
        return repositorioProducto.findByNombreContaining(patron);
    }

    @Override
    public List<Producto> listarProductoPorCategoria(int category_id) {
        return repositorioProducto.listarProductoPorCategoria(category_id);
    }

    @Override
    public List<Producto> obtenerProductoPorPatronsql(String patron) {
        return repositorioProducto.obtenerProductoPorPatronsql(patron);
    }


}
