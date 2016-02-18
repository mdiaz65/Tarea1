package paquete;

import java.util.Random;
public class Carta2 implements ICarta{
	
	int[] carta=new int[8];
	
	public Carta2(){
		Random random= new Random();
		for (int i=0;i<carta.length;i++){
			carta[i]=random.nextInt(52);
			if(isRepeated(i)){
				i--;
			}
		}
	}

	private boolean isRepeated(int i){
		for(int j=0;j<i;j++){
			if(carta[i]==carta[j]){
				return true;
			}
		}
		return false;
	}

	@Override 
	public String toString(){
		String s="[";
		for(int i=0;i<carta.length;i++){
			s=s+carta[i]+",";
		}
		return s+"]";
	}
	public void syso(){
		System.out.print("[");
		for(int i=0;i<carta.length;i++){
			System.out.print(carta[i]);
			if(i+1<carta.length){
				System.out.print(",");
			}
		}
		System.out.println("]");
	}

}