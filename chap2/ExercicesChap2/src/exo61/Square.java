package exo61;

public class Square extends Rectangle{
	public Square() {
		super();
	}
	
	public Square(double side) {
		super(side,side);
	}
	
	public Square(double side, String color, boolean filled) {
		super(side,side,color,filled);
	}
	
	public double getSide() {
		return super.getWidth();
	}
	
	public void setSide(double side) {
		super.setWidth(side);
		super.setLength(side);
		
	}
	
	public void setWidth(double side) {
		setSide(side);
	}
	
	public void setLength(double side) {
		setSide(side);
	}

	@Override
	public String toString() {
		return "Square [" + super.toString() + ", width=" + this.getWidth() + ", length=" + this.getLength() + "]";
	}
	
	public static void main(String[]args) {
		Shape carre1 = new Square();
		System.out.println(carre1);
		
	}
}
