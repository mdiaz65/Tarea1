package paquete;

public class Square extends GeometricFigure{
	double lado;
	public Square(double lado)
	{
		this.lado=lado;
	}
	public double CalculateArea()
	{
		return lado*lado;
	}
	public double calculatePerimeter()
	{
		return 4*lado;
	}
}
