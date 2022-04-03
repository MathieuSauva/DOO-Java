package exo13;

public class Rectangle {
	private float length;
	private float width;
	
	
	public Rectangle() {
		this.length = 1.0f;
		this.width = 1.0f;
	}
	
	public Rectangle(float l, float w) {
		this.length = l;
		this.width = w;
	}
	
	public void setLength(float newLength) {
		this.length = newLength;
	}
	
	public float getLength() {
		return length;
	}

	public void setWidth(float newWidth) {
		this.width = newWidth;
	}
	
	public float getWidth() {
		return width;
	}
	
	public double getArea() {
		return length*width;
	}
	
	public double getPerimeter() {
		return (length+width)*2;
	}
	
    public String toString() {
	    return "Rectangle[length=" + length + " width=" + width + "]";
    }
}
