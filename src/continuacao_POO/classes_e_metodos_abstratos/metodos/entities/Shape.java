package continuacao_POO.classes_e_metodos_abstratos.metodos.entities;

import continuacao_POO.classes_e_metodos_abstratos.metodos.entities.enums.Color;

public abstract class Shape {
	private Color color;
	
	public Shape() {
		
	}

	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
	
}
