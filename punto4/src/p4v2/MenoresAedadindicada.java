package p4v2;

import java.util.Scanner;

public class MenoresAedadindicada implements IComparisonStrategyv2 {
	static Scanner sc = new Scanner(System.in);

	@Override
	public void OrdenarEstudiantes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FiltadroEstudiantes() {
		//M�todo para mostrar todos los estudiantes con una edad  inferior
	    //al n�mero que se pide por teclado
		int edad;
        System.out.print("Buscar estudiantes menores a esta edad: ");
        edad = sc.nextInt();
        System.out.println("Estudiantes con menos de " + edad + " edad");
        for(int i = 0; i<Estudiantev2.Estudiantes.size(); i++){
            if(Estudiantev2.Estudiantes.get(i).getedad() < edad)
                System.out.println(Estudiantev2.Estudiantes.get(i));
        }
    }
		
	

	@Override
	public void mostrarEstudiantes() {
		// TODO Auto-generated method stub
		
	}

}
