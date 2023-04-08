package Secao_19.Application;

import java.util.ArrayList;
import java.util.List;

import Secao_19.Entities.Circle;
import Secao_19.Entities.Rectangle;
import Secao_19.Entities.Shape;


public class ProgramShape {

	public static void main(String[] args) {
		
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));
		
		System.out.println("Total area: " + totalArea(myShapes));

	}
	
	public static double totalArea(List<? extends Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}

}
