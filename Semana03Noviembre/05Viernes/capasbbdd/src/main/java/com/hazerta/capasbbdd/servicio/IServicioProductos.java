package com.hazerta.capasbbdd.servicio;

import com.hazerta.capasbbdd.modelo.Producto;
import org.springframework.beans.factory.annotation.Autowired;

import javax.swing.*;
import java.util.List;

public interface IServicioProductos {

    List<Producto> obtenertodos() throws Exception;
}
