package com.hazerta.EjerciciosSpring.ejercicios12_Consultas.primary.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAutobuses extends JpaRepository<Autobus, String> {
}
