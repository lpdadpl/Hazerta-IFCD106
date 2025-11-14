package com.hazerta.Ejercicios.servicio;


import com.hazerta.Ejercicios.modelo.Cliente;
import com.hazerta.Ejercicios.proyecciones.ICiudadPais;
import com.hazerta.Ejercicios.repositorio.IRepositorioCliente;
import org.springframework.stereotype.Service;

import java.util.List;



@Service
public class ServicioClienteImpl implements IServicioCliente{

    private final IRepositorioCliente repositorioCliente;

    public ServicioClienteImpl(IRepositorioCliente repositorioCliente) {
        this.repositorioCliente = repositorioCliente;
    }

    @Override
    public List<Cliente> listarClientes() {
        return repositorioCliente.findAll();
    }

    @Override
    public List<Cliente> listarClientePorCiudad(String ciudad) {
        return repositorioCliente.findByCity(ciudad);

    }

    @Override
    public List<Cliente> listarClienteEmpresa(String empresa) {
        return repositorioCliente.findTop3ByCompanyNameContaining(empresa);
    }

    @Override
    public List<String> listarCiudadesPorPais(String pais) {
        return repositorioCliente.findDistinctCityByCountry(pais);
    }

    @Override
    public List<Cliente> listarClientesPorEmpresaDesc(String empresa) {
        return repositorioCliente.findAllByOrderByCompanyNameDesc();
    }

    @Override
    public List<Cliente> listarClientePorListaPaises(List<String> listaPaises) {
        return repositorioCliente.findByCountryIn(listaPaises);
    }
}
