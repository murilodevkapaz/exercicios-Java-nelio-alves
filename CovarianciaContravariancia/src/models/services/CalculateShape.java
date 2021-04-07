package models.services;

import java.util.List;

import models.entities.Shape;

public class CalculateShape {
	public static <T> Double totalArea(List<? extends Shape> shapes) {
		Double totalArea = 0.0;
		for(Shape shape : shapes) {
			totalArea += shape.area();
		}
		return totalArea;
	}
}
