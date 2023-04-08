package entities;

public class Rectangle {
	public double l;
	public double b;
	
	public double area() {
		return l*b;
	}
	
	public double perimeter() {
		return 2*(l+b);
	}
	
	public double diagonal() {
		return Math.sqrt((Math.pow(l, 2.0)+Math.pow(b, 2.0)));
	}
	
}
