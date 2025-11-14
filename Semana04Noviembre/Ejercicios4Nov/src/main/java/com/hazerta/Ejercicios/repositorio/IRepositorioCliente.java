package com.hazerta.Ejercicios.repositorio;

import com.hazerta.Ejercicios.modelo.Cliente;
import com.hazerta.Ejercicios.proyecciones.ICiudadPais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IRepositorioCliente extends JpaRepository<Cliente, String> {

    List<Cliente> findByCompanyName(String nombre);
    List<Cliente> findByCity(String ciudad);
    List<Cliente> findTop3ByCompanyNameContaining(String empresa);
    List<String>  findDistinctCityByCountry(String pais);
    List<Cliente> findAllByOrderByCompanyNameDesc();
    List<Cliente> findByCountryIn(List<String> listaPaises);


}
