package paquete;
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ICarta> cartaList=new ArrayList<ICarta>();
		
		for(int i=0;i<4;i++)
		{
			ICarta carta=new Carta2();
			cartaList.add(carta);
			carta.syso();
		}

	}

}
