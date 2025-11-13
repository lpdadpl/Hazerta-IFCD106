package com.hazerta.jpaconsultas.repositorio;

import com.hazerta.jpaconsultas.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IRepositorioProducto extends JpaRepository<Producto, Integer> {

    List<Producto> listarPorNombre(String patron);
    List<Producto> findByNombreContaining(String patron);
    List<Producto> listarProductoPorCategoria(int category_id);

    @Query("select p from Products p where p.nombre like %?1%")
    List<Producto> obtenerProductoPorPatronjpql(String patron);


    @Query(value = "select * from products where product_name like %?1%", nativeQuery = true)
    List<Producto> obtenerProductoPorPatronsql(String patron);

}
