package exo61;

abstract public class Shape {
	private String color;
	private Boolean filled;
	
	public Shape(String color, boolean filled) {
		this.color = color;
		this.filled = filled;
	}
	
	public Shape() {
		this("red", true);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public boolean isFilled() {
		return filled;
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	abstract double getArea();
	
	abstract double getPerimeter();
	
	public String toString() {
		return "shape[color="+color+",filled="+filled+"]";
	}
}
