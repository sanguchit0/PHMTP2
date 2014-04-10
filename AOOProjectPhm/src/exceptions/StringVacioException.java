package exceptions;

public class StringVacioException extends RuntimeException{
	String mensaje;
	
	public StringVacioException(String m){
		this.mensaje=m;
	}
}
