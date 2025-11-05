package com.hazerta.presentacion;

import com.hazerta.modelo.Customer;
import com.hazerta.persistencia.AcessoCustomers;

import java.sql.SQLException;
import java.util.List;

public class LlamadaCustomers {
    public static void main(String[] args) {

        System.out.println("inicio aplicacion");
        AcessoCustomers ac = new AcessoCustomers();

        try{
            List<Customer> customers = ac.obtenerCustomers();
            for(Customer c : customers){
                System.out.println(c.toString());
            }
        } catch (ClassNotFoundException e){
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e.toString());
        }
    }
}
