package p4v2;

public class mostrarMayorEdad implements IComparisonStrategyv2 {

	@Override
	public void OrdenarEstudiantes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void FiltadroEstudiantes() {
		//Filtra el estudiante mayor de toda la lista agregada
		Estudiantev2 mayor = Estudiantev2.Estudiantes.get(0);
        for(int i = 0; i < Estudiantev2.Estudiantes.size(); i++){
            if(Estudiantev2.Estudiantes.get(i).getedad() > mayor.getedad())
                mayor = Estudiantev2.Estudiantes.get(i);
        }
        System.out.println("El filtrado arroja que el estudiante de mayor edad es :  ");
        System.out.println(mayor);	
	}

	@Override
	public void mostrarEstudiantes() {
		// TODO Auto-generated method stub
		
	}

}
