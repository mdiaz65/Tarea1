package p4v2;

import java.util.ArrayList;
import java.util.Scanner;



public class Estudiantev2 extends Pruebav2{
	static Scanner sc = new Scanner(System.in);
	private String nombre;
    private String apellido;
    private String carrera;
    private int edad;
    //public static ArrayList<Estudiantev2> Estudiantes;
    public static ArrayList<Estudiantev2> Estudiantes = new ArrayList<Estudiantev2>();
    
    
    public int getedad() {
        return edad;
    }

    public void setedad(int edad) {
        this.edad = edad;
    }
 
    public String getapellido() {
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;
    }

    public String getcarrera() {
        return carrera;
    }

    public void setcarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("\nNombre: ");
        sb.append(nombre);
        sb.append("\nApellido: ");
        sb.append(apellido);
        sb.append("\nCarrera: ");
        sb.append(carrera);
        sb.append("\nEdad: ");
        sb.append(edad);    
        return sb.toString();
    } 
    public static void leerEstudiantes(){
        //Declaración de variables para leer los datos de los Estudiantes
        String nombre;
        String apellido;
        String carrera;
        int edad;
        //Variable auxiliar que contendrá la referencia a cada Estudiante nuevo.
        Estudiantev2 aux;
        int i, N;
        //se pide por teclado el número de Estudiantes a leer
        do {
            System.out.print("Número de Estudiantes? ");

 
            N = sc.nextInt();
        } while (N < 0);
        sc.nextLine(); //limpiar el intro
        //lectura de N Estudiantes
        for (i = 1; i <= N; i++) {
            //leer datos de cada Estudiante
            System.out.println("Estudiante " + i);
            System.out.print("Nombre: ");
            nombre = sc.nextLine();          
            System.out.print("Apellido: ");
            apellido = sc.nextLine();
            System.out.print("Carrera: ");
            carrera = sc.nextLine();
            System.out.print("Edad: ");
            edad = sc.nextInt();
            sc.nextLine(); //limpiar el intro
            aux = new Estudiantev2(); //Se crea un objeto Estudiante y se asigna su referencia a aux
            //se asignan valores a los atributos del nuevo objeto
            aux.setnombre(nombre);
            aux.setapellido(apellido);
            aux.setcarrera(carrera);
            aux.setedad(edad);
                      
           //se añade el objeto al final del array
            Estudiantev2.Estudiantes.add(aux);
        }
        System.out.println("\nEstudiantes  introducidos:");
    } //fin método leerEstudiantes()
      
}


