package paquete;

public class Circle extends GeometricFigure{
	double pi=3.141592;
	double radio;
	public Circle(double radio)
	{
		this.radio=radio;
	}
	//Overload Circle to receive a given pi value
	public Circle(double radio,double pi)
	{
		this.radio=radio;
		this.pi=pi;
	}
	public double CalculateArea()
	{
		return pi*radio*radio;	
	}
	public double calculatePerimeter()
	{
		return 2*pi*radio;
	}
	
	

}
