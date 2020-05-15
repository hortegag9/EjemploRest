package org.alexys.rest.recursos;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.alexys.rest.modelo.Comentario;
import org.alexys.rest.servicio.ComentarioServicio;

@Path("/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ComentarioRecurso {
	
   ComentarioServicio servicio = new ComentarioServicio();
	
   @GET
   public List<Comentario> getComentarios(@PathParam("articuloId") int articuloId){
	   return servicio.getComentarios(articuloId);
   }
}
