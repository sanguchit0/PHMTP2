package clases;

import annotations.Monitored;

public class Persona {
	 	private String nombre ;
	 	private String apellido;
	 	private int edad;
	 	
	 	public Persona(){
	 		this.nombre="Juan";
	 		this.apellido="Perez";
	 		this.edad=35;
	 	}
	    
	    @Monitored
	    public String getNombre() {
	        return this.nombre ;
	    }
	    
	    @Monitored
	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }
	    
	    @Monitored
	    public String getApellido() {
	        return this.apellido ;
	    }
	    
	    @Monitored
	    public void setApellido(String unApellido) {
	        this.apellido = unApellido;
	    }
	    
	    @Monitored
	    public int getEdad() {
	        return this.edad ;
	    }
	    
	    @Monitored
	    public void setEdad(int unaEdad) {
	        this.edad = unaEdad;
	    }
}
