package application;


import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import models.entities.Circle;
import models.entities.Rectangle;
import models.entities.Shape;
import models.services.CalculateShape;

public class Program {

	public static void main(String[] args) {	
		Locale.setDefault(Locale.US);
		/*
		 * String folderPath =
		 * "C:\\Users\\OSASSP01\\Desktop\\murilo\\java\\exercicios-java\\CovarianciaContravariancia\\assets";
		 * List<String> shapes = Arrays.asList("Triangle", "Losangle", "Rectangle",
		 * "Square"); 
		 * String newFolder = folderPath+"\\newFolder"; 
		 * boolean success = new File(newFolder).mkdir();
		 * 
		 * try(BufferedWriter bw = new BufferedWriter(new
		 * FileWriter(newFolder+"\\file.txt", true))){
		 * 
		 * for(String shape : shapes) { bw.write(shape); bw.newLine(); } }
		 * catch(IOException e) { System.out.println("Error: "+ e.getMessage());
		 * e.printStackTrace(); }
		 */
		
		List<Circle> circles = new ArrayList<>();
		circles.add(new Circle(2.2));
		circles.add(new Circle(2.0));
		
		List<Rectangle> rectangles = new ArrayList<>();
		rectangles.add(new Rectangle(2.5, 5.4));
		rectangles.add(new Rectangle(3.0, 5.4));
		
		
		List<Shape> shapes = new ArrayList<>();
		shapes.add(new Rectangle(4.1, 6.9));
		shapes.add(new Circle(4.1));
		
		Double totalArea = CalculateShape.totalArea(shapes);
		
		System.out.printf("Total Area: %.2f", totalArea);
	}

}
