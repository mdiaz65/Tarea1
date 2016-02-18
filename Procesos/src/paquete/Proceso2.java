package paquete;

public class Proceso2 extends ClaseAbstracta{
boolean estado=false;
	
	public Proceso2(){
		estado=true;
	}
	public void estado(){
		if(this.estado==true)
		{
			System.out.println("El proceso esta activo");
		}
		else
		{
			System.out.println("El proceso esta inactivo");
		}
	}
	//Para este ejemplo se definen dos procesos los cuales son diferentes para el proceso1
	//y para el proceso2 y uno en común para los dos, con el fin de implementar una clase abstracta
	public void accion1(){
		System.out.println("Proceso de llenar la caldera hasta su maxima capacidad activo");
	}
	public void accion2(){
		System.out.println("Proceso de mezclar la sustancia de la caldera por 3 minutos activo");
	}

}
