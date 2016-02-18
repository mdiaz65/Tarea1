package EjemploStatic;

public class Persona {
	//Crearemos un contador de personas creadas de la clase
	//La declaramos static ya que podria modificarse en cada objeto creado
	//y necesitamos es que todos los objetos compartan este dato 
	//para tener un conteo y no se modifique por cualquier tipo de creacion de un objeto persona
	String nombre;
	int edad;
	int peso;
	private static int contadorPersonas;
	
	public Persona() {
        contadorPersonas++;
    }
	public Persona(String n,int e,int p){
		this.nombre = n;
		this.edad = e;
		this.peso=p;
		contadorPersonas++;
	}
	
	public void asignarNombre(String nom) {
        nombre = nom;
    }
	
	public String obtenerNombre(){
		return nombre;
	}
	
	public int obtenerEdad(){
		return edad;
	}
	
	public static int obtenerNumPer(){
		return contadorPersonas;
	}
	
}
