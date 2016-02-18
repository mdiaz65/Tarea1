package paquete;

public class Rectangular extends GeometricFigure {
	double base;
	double altura;
	public  Rectangular(double base,double altura){
		this.base=base;
		this.altura=altura;
	}
	
	public double CalculateArea()
	{
		return base*altura;
	}
	public double calculatePerimeter()
	{
		return 2*(base+altura);
	}

}
