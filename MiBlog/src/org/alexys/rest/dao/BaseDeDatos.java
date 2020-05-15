package org.alexys.rest.dao;

import java.util.ArrayList;
import java.util.List;

import org.alexys.rest.modelo.Articulo;
import org.alexys.rest.modelo.Comentario;

public final class BaseDeDatos {
	
	private final static BaseDeDatos basedeDatos = new BaseDeDatos();
	private final List<Articulo> listado = new ArrayList<>();
	
	private BaseDeDatos() {
	
		Articulo art1 = new Articulo(1,"Primer articulo","Primer contenido","Hugo");
		Articulo art2 = new Articulo(2,"Segundo articulo","Segundo contenido","Alexys");
		art1.getComentarios().add(new Comentario(1,"Buen Articulo","Daniel"));
		
		listado.add(art1);
		listado.add(art2);
			
	}
	
	public static BaseDeDatos getInstancia() {		
		return basedeDatos; 
	}
	
	public List<Articulo> getListado(){
		return listado;
	}

}
