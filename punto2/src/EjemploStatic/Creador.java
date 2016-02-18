package EjemploStatic;

public class Creador {

	public static void main(String[] args) {
		Persona p1 = new Persona("Carlos",23,87);
		
		Persona p2 = new Persona("Juan",25,87);
		System.out.println("Se han creado este numero de personas :"+ Persona.obtenerNumPer() + " personas ");
		//Este dato lo comparten todos los objetos creado de la clase persona 
	}

}
