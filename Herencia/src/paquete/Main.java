package paquete;

public class Main {

	public static void main(String[] args) {
		
		Circle c=new Circle(3);//Aqui el usuario puede agregar el valor de pi como segundo parametro
		System.out.println("El area del circulo es:"+c.CalculateArea());
		Rectangular r=new Rectangular(4,3);
		System.out.println("El perimetro del rectangulo es:"+r.calculatePerimeter());
		Square s=new Square(2);
		System.out.println("El area del cuadrado es:"+s.CalculateArea());
		
		

	}

}
