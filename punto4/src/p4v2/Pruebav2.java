package p4v2;



public abstract class Pruebav2 {
	private IComparisonStrategyv2 myStrategy;
	public void setAlgoritmo(IComparisonStrategyv2 a){
		 this.myStrategy=a;
	}
	 
	 public void Ordenar(){
		 this.myStrategy.OrdenarEstudiantes();
	 }
	 public void Mostrar(){
		 this.myStrategy.mostrarEstudiantes();
	 }
	 
	 public void Filtrar(){
		 this.myStrategy.FiltadroEstudiantes();
	 }

}
