package com.formacionjava.springmvc.servicios;

import java.util.List;

import com.formacionjava.springmvc.entidad.Empleado;

public interface EmpleadoServicio {
	public List<Empleado> listarTodosLosTrabajadores();

	public Empleado guardarEmpleado(Empleado empleado);
	
	
	public Empleado obtenerEmpleadoPorId(Long id);
	//metodo para eliminar un empleado por id
	public void eliminarEmpleado(Long id);
	
}


