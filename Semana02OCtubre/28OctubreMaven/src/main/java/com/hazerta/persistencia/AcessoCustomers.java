package com.hazerta.persistencia;

import com.hazerta.modelo.Customer;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class AcessoCustomers extends Connection{

    public List<Customer> obtenerCustomers() throws SQLException, ClassNotFoundException {
        //1. Declarar variables
        Statement sentencia;
        ResultSet rejilla;
        List<Customer> listaCustomers = new ArrayList<>();
        String sql = "SELECT customer_id, company_name FROM customers";
        //2. Abrir conexion
        openConnection();
        //3. Abrir sentencia
        sentencia =  myConnection.createStatement();
        //4. Ejecutar sentencia
        rejilla = sentencia.executeQuery(sql);
        //5. Procesar resultados
        while (rejilla.next()){
            Customer c = new Customer();
            c.setId(rejilla.getString("customer_id"));
            c.setCompanyName(rejilla.getString("company_name"));
            listaCustomers.add(c);
        }

        cerrarConexion();
        return listaCustomers;


    }
    
    
}
