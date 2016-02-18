package paquete;
import java.util.ArrayList;
import java.util.Random;

public class CrearLista 	{
	ArrayList<Integer> Lista=new ArrayList<Integer>();
	public CrearLista(int n)
	{
		Lista=rellenarLista(n);
	}
	public ArrayList<Integer> rellenarLista (int no){
		// Declaración el ArrayList
		
		
		Random  rnd = new Random();			
		
		
		ArrayList<Integer> Lista = new ArrayList<Integer>();
		// Añadimos 10 Elementos en el ArrayList
		for (int i=1; i<=no; i++){
			Lista.add(rnd.nextInt(100));	
		}
		return Lista;
}
}
