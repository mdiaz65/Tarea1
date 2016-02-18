package p4v2;

import java.util.ArrayList;
import java.util.Scanner;







public class TestStrategyv2 {
	
    static Scanner sc = new Scanner(System.in);
    //método main
    public static void main(String[] args) {
    	Estudiantev2 Estudiant = new Estudiantev2();
    	
        Estudiant.leerEstudiantes();
        
        Estudiant.setAlgoritmo(new MenorAMayor());
        Estudiant.Ordenar();
        Estudiant.Mostrar();
        
        Estudiant.setAlgoritmo(new mostrarMayorEdad());
        Estudiant.Filtrar();
        
        Estudiant.setAlgoritmo(new MenoresAedadindicada());
        Estudiant.Filtrar();
        
        
    } //fin método main
    
  
 
    //ESTE METODO FUNCIONA PERO NO SE ALCANZO A INSERTAR DENTRO DE UNA ESTRATEGIA PARA QUE ORGANICE Y ENCUENTRE POR APELLIDO
    //Método para mostrar todos los estudiantes de un apellido que se pide por teclado
   /* public static void mostrarPorApellido(){
        String apellido;
        System.out.print("Buscar estudiantes de Apellido: ");
        apellido = sc.nextLine();
        System.out.println("Estudiante de apellidos " + apellido);
        for(int i = 0; i<Estudiantev2.Estudiantes.size(); i++){
            if(Estudiantev2.Estudiantes.get(i).getapellido().equalsIgnoreCase(apellido))
                System.out.println(Estudiantev2.Estudiantes.get(i));
        }
    }*/
    
  
}    