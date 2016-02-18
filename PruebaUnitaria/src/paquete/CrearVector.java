package paquete;

import java.util.Random;

public class CrearVector {
	int[] v=new int[10];
	public CrearVector(){
		
		Random random= new Random();
		for (int i=0;i<v.length;i++){
			v[i]=random.nextInt(52);
		}
	}
}
