package com.formacionjava.springmvc.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.formacionjava.springmvc.entidad.Empleado;
import com.formacionjava.springmvc.repositorio.EmpleadoRepositorio;
@Service
public class EmpleadoServicioImpl implements EmpleadoServicio {
	
	@Autowired
	private EmpleadoRepositorio repositorio;

	@Override
	public List<Empleado> listarTodosLosTrabajadores() {
		// TODO Auto-generated method stub
		return repositorio.findAll();
	}

	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		// TODO Auto-generated method stub
		return repositorio.save(empleado);
	}

	@Override
	public Empleado obtenerEmpleadoPorId(Long id) {
		return repositorio.findById(id).orElse(null);
	}

	@Override
	public void eliminarEmpleado(Long id) {
		repositorio.deleteById(id);
	}

	
}
