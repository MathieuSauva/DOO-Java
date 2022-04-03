package exo31;

public class MyComplex {
	private double real;
	private double imag;
	
	public MyComplex() {
		this.real = 0.0;
		this.imag = 0.0;
	}
	
	public MyComplex(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public double getReal() {
		return real;
	}
	
	public void setReal(double real) {
		this.real = real;
	}
	
	public double getImag() {
		return imag;
	}
	
	public void setImag(double imag) {
		this.imag = imag;
	}
	
	public void setValue(double real, double imag) {
		this.real = real;
		this.imag = imag;
	}
	
	public String toString() {
		return real + "+" + imag + "i";
	}
	
	public boolean isReal() {
		return (real == 0);
	}
	
	public boolean isImaginary() {
		return (imag == 0);
	}
	
	public boolean equals(double real, double imag) {
		return (this.real == real && this.imag == imag);
	}
	
	public boolean equals(MyComplex another) {
		return (this.real == another.real && this.imag == another.imag);
	}
	
	public double magnitude() {
		return Math.sqrt(Math.pow(real, real) + Math.pow(imag, imag));
	}
	
	public MyComplex addInto(MyComplex right) {
		double real;
		double imag;
		
		real = right.getReal();
		imag = right.getImag();
		
		this.real += real;
		this.imag += imag;
		
		
		return this;
	}
	
	public MyComplex addNew(MyComplex right) {
		return new MyComplex(this.real + right.real, this.imag + right.imag);
	}
}