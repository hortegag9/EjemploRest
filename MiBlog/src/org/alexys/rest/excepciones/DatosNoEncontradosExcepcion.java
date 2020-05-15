package org.alexys.rest.excepciones;

public class DatosNoEncontradosExcepcion extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DatosNoEncontradosExcepcion() {
		
	}
	
	public DatosNoEncontradosExcepcion(String mensaje) {
	   super(mensaje);
	}

}
