package paquete;
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaDeUnidad {
	
	CrearLista l=new CrearLista(10000);
	CrearLinkedList l2=new CrearLinkedList(10000);
	
	@Test
	public void obtenerElementoArrayList()
	{
		// el limite del for se varia de acuerdo al numero de operaciones
		for(int i=0;i<1000;i++)
		{
			l.Lista.get(20);
		}
	}
	@Test
	public void eliminarElmentoArrayList()
	{
		
		// el limite del for se varia de acuerdo al numero de operaciones
		for(int i=0;i<1000;i++)
		{
			l.Lista.remove(i);
		}
		
	}
	@Test 
	public void InsertElementoArrayList()
	{
		// el limite del for se varia de acuerdo al numero de operaciones
		for(int i=0;i<1000;i++)
		{
			l.Lista.add(20,15);
			
		}
		
	}
	@Test
	public void obtenerElementoLinkedList()
	{
		// el limite del for se varia de acuerdo al numero de operaciones
		for(int i=0;i<1000;i++)
		{
			l2.ListaEnlazada.get(15);
		}
	
	}
	@Test
	public void eliminarElementoLinkedList()
	{
		// el limite del for se varia de acuerdo al numero de operaciones
		for(int i=0;i<1000;i++)
		{
			l2.ListaEnlazada.remove(i);
		}
		
	}
	@Test
	public void InsertarElementoLinkedList()
	{
		// el limite del for se varia de acuerdo al numero de operaciones
		for(int i=0;i<1000;i++)
		{
			l2.ListaEnlazada.add(120,"Hola");
		}
		
	}
	
	
	
	
}
