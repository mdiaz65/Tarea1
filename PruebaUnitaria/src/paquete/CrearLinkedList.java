package paquete;

import java.util.LinkedList;
import java.util.Random;

public class CrearLinkedList {

	LinkedList ListaEnlazada=new LinkedList();
	public CrearLinkedList(int n)
	{
		ListaEnlazada=rellenarLista(n);
	}
	public LinkedList rellenarLista (int no){
		// Declaraci�n el LinkedList
		
		
		Random  rnd = new Random();			
		
		
		LinkedList Lista = new LinkedList();
		// A�adimos 10 Elementos en la linkedList
		for (int i=1; i<=no; i++){
			Lista.add(rnd.nextInt(100));	
		}
		return Lista;
	}
}
