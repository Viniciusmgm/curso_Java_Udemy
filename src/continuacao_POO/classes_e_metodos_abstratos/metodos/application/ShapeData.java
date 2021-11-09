package continuacao_POO.classes_e_metodos_abstratos.metodos.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import continuacao_POO.classes_e_metodos_abstratos.metodos.entities.Circle;
import continuacao_POO.classes_e_metodos_abstratos.metodos.entities.Rectangle;
import continuacao_POO.classes_e_metodos_abstratos.metodos.entities.Shape;
import continuacao_POO.classes_e_metodos_abstratos.metodos.entities.enums.Color;

public class ShapeData {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.printf("Enter the number of shapes: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			System.out.printf("Shape #%d data: \n", i + 1);
			
			System.out.print("Rectangle or Circle (r/c)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.next();
			
			if(ch == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				Shape shape = new Circle(Color.valueOf(color), radius);
				shapes.add(shape);
			}
			else {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				Shape shape = new Rectangle(Color.valueOf(color), width, height);
				shapes.add(shape);
			}
		}
		System.out.println("\nSHAPE AREAS:");
		for(Shape shape : shapes) {
			System.out.printf("%.2f", shape.area());
		}
		
		sc.close();
	}
}
