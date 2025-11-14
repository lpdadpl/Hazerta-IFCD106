package com.hazerta.Ejercicios.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "customers")
public class Cliente {
    @Id
    @Column(length = 5, name = "customer_id", nullable = false)
    private String idcustomer;
    @Column(length = 40, name = "company_name", nullable = false)
    private String companyName;
    private String contactName;
    private String address;
    private String city;
    private String country;

}
