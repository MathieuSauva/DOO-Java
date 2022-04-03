package exo52;

public class Cylinder {
	private Circle base;
	private double height;
	
	public Cylinder(){
		base = new Circle();
		height = 1.0;
	}
	
	public Cylinder(double radius) {
		base = new Circle(radius);
	}
	
	public Cylinder (double radius, double height) {
		this(radius);
		this.height = height;
	}
	
	public Cylinder (double radius, double height, String color) {
		this(height);
		base = new Circle (radius, color);
	}
	
	public double getHeight(){
		return this.height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return base.getArea()*height; 
	}
}
