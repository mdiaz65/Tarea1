package p4v2;

import java.util.ArrayList;

public class MenorAMayor implements IComparisonStrategyv2{

	@Override
	public void OrdenarEstudiantes() {
			//Ordena de Menor A Mayor
	        int i, j;
	        Estudiantev2 aux;
	        for(i = 0; i< Estudiantev2.Estudiantes.size()-1; i++)
	            for(j=0;j<Estudiantev2.Estudiantes.size()-i-1; j++)
	                if(Estudiantev2.Estudiantes.get(j+1).getedad() < Estudiantev2.Estudiantes.get(j).getedad()){
	                    aux = Estudiantev2.Estudiantes.get(j+1);
	                    Estudiantev2.Estudiantes.set(j+1, Estudiantev2.Estudiantes.get(j));
	                    Estudiantev2.Estudiantes.set(j, aux);                
	                }
	        
	    }
	
		
	

	@Override
	public void FiltadroEstudiantes() {
		// TODO Auto-generated method stub
		
	}




	@Override
	public void mostrarEstudiantes() {
		//Muestra la lista ordenada de menor a mayor de los estudiantes agregados
		System.out.println("Estudiantes ordenados de Menor a Mayor por edades son : ");
		for(int i = 0; i< Estudiantev2.Estudiantes.size(); i++)
            System.out.println(Estudiantev2.Estudiantes.get(i)); //se invoca el método toString de la clase Estudiantev2
		
	}

}
