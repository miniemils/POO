package entities;

public class Triangle {
	
	public double a;
	public double b;
	public double c;

	//para calcular a area de um triângulo, não é necessário parametros,
	//pois os atributos a, b e c contidos na classe já são o suficiente
	
	public double area() {
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p-a) * (p-b) * (p-c));
		return area;
	}
	
}
