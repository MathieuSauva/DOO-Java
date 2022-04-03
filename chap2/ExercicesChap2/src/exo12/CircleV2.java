/**
 * The Circle class models a circle with a radius.
 */
package exo12;

public class CircleV2 {  // Save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   
   // Constructors (overloaded)
   /** Constructs a Circle instance with default value for radius */
   public CircleV2() {  // 1st (default) constructor
      this.radius = 1.0;
   }
   
   /** Constructs a Circle instance with the given radius */
   public CircleV2(double r) {  // 2nd constructor
      this.radius = r;
   }
	   
   /** Returns the radius */
   public double getRadius() {
     return radius; 
   }
   
   /** Returns the area of this Circle instance */
   public double getArea() {
      return radius*radius*Math.PI;
   }
   
   // Setter for instance variable radius
   public void setRadius(double newRadius) {
      this.radius = newRadius;
   }
 
   /** Return a self-descriptive string of this instance in the form of Circle[radius=?] */
   public String toString() {
      return "Circle[radius=" + radius + "]";
   }
   
   public double getCircumference() {
	   return 2*Math.PI*radius;
   }
}