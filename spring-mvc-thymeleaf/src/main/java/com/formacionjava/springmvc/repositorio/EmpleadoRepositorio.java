package com.formacionjava.springmvc.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.formacionjava.springmvc.entidad.Empleado;
@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long>{

}
