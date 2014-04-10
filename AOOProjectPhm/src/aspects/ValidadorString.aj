package aspects;

import exceptions.StringVacioException;

public aspect ValidadorString {
	
	
	pointcut setterStringVacio(String nuevoString):call(* clases.set*(String)) && ! withincode(Persona) && args(nuevoString);
	
	before(String nuevoString): setterStringVacio(nuevoString){
		
		if(nuevoString == ""){ throw new StringVacioException("El string nuevo estaba vacío");}
		
		
	}
	
	
}
