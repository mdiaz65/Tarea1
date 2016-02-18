package paquete;

import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
	CrearLista lista2=new CrearLista(10);
	System.out.println(Arrays.asList(lista2.Lista));
	System.out.println(lista2.Lista.get(2));
	CrearVector x=new CrearVector();
	System.out.println(x.v);
	}

	
}
