package Secao_14.Programa_main;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Secao_14.Entities.Shapes.Circle;
import Secao_14.Entities.Shapes.Color;
import Secao_14.Entities.Shapes.Rectangle;
import Secao_14.Entities.Shapes.Shape;

public class ProgramShape {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.print("Enter the number of shapes:");
		int x = sc.nextInt();
		
		for (int i=1; i<=x;i++) {
			System.out.println("Shape #"+i+" data:");
			System.out.print("Rectangle or Circle (r/c): ");
			char type = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Color (BLACK,BLUE,RED): ");
			Color color = Color.valueOf(sc.next());
			if (type == 'r') {
				System.out.print("Widht: ");
				double width = sc.nextDouble();
				System.out.print("Height: ");
				double height = sc.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				list.add(new Circle(color, radius));
			}
		}
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape obj: list) {
			System.out.println(String.format("%.2f", obj.area()));
		}

		sc.close();
	}

}
