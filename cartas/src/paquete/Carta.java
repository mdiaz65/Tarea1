package paquete;

import java.util.Random;
public class Carta implements ICarta {
	
	int[] carta=new int[8];
	
	public Carta(){
		Random random= new Random();
		for (int i=0;i<carta.length;i++){
			carta[i]=random.nextInt(52);
		}
	}
	
	public int[] getCarta(){
		return carta;
	}
	
	public void setCarta(int[] carta)
	{
		this.carta=carta;
		
	}

	@Override 
	public String toString(){
		String s="[";
		for(int i=0;i<carta.length;i++){
			s=s+carta[i]+",";
		}
		return s+"]";
	}
	/* (non-Javadoc)
	 * @see paquete.ICarta#syso()
	 */
	@Override
	public void syso(){
		System.out.println(this.toString());
	}

}
