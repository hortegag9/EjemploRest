package org.alexys.rest.excepciones;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import org.alexys.rest.modelo.MensajeError;

@Provider
public class ExcepcionGenerica implements ExceptionMapper<Throwable>{

	@Override
	public Response toResponse(Throwable exception) {
		// TODO Auto-generated method stub
		MensajeError mensaje = new MensajeError(exception.getMessage(),500,exception.getCause().toString());
		return Response.status(Response.Status.NOT_FOUND).entity(mensaje).build();
	}
	

}
