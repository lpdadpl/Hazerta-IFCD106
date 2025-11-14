package com.hazerta.Ejercicios.servicio;

import com.hazerta.Ejercicios.modelo.Cliente;

import java.util.List;

public interface IServicioCliente {
    List<Cliente> listarClientes();
    List<Cliente> listarClientePorCiudad(String ciudad);
    List<Cliente> listarClienteEmpresa(String empresa);
    List<String> listarCiudadesPorPais(String Pais);
    List<Cliente> listarClientesPorEmpresaDesc(String empresa);
    List<Cliente> listarClientePorListaPaises(List<String> listaPaises);

}
