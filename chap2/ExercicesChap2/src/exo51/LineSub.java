package exo51;

public class LineSub extends Point {
   // A line needs two points: begin and end.
   // The begin point is inherited from its superclass Point.
   // Private variables
   Point end;               // Ending point
   
   // Constructors
   public LineSub (int beginX, int beginY, int endX, int endY) {
      super(beginX, beginY);             // construct the begin Point
      this.end = new Point(endX, endY);  // construct the end Point
   }
   public LineSub (Point begin, Point end) {  // caller to construct the Points
      super(begin.getX(), begin.getY());      // need to reconstruct the begin Point
      this.end = end;
   }
   
   // Public methods
   // Inherits methods getX() and getY() from superclass Point
   @Override
   public String toString() { 
	   return "LineSub : " + "(" + getX() + "," + getY() + ") (" + end.getX() + "," + end.getY() + ")";
   }
   
   public Point getBegin() { 
	   return this;
   }
   public Point getEnd() {
	   return this.end;
   }
   public void setBegin(int beginX, int beginY) {
	   setXY(beginX, beginY);
   }
   public void setEnd(int endX, int endY) { 
	   setXY(endX, endY);
   }
   
   public int getBeginX() { 
	   return getX();
   }
   public int getBeginY() {
	   return getY();
   }
   public int getEndX() { 
	   return this.end.getX();
   }
   public int getEndY() {
	   return this.end.getY();
   }
   
   public void setBeginX(int  beginX) { 
	   setX(beginX);
   }
   public void setBeginY(int beginY) { 
	   setY(beginY);
   }
   public void setBeginXY(int beginX, int beginY) { 
	   setXY(beginX, beginY);
   }
   public void setEndX(int endX) { 
	   setX(endX);
   }
   public void setEndY(int endY) { 
	   setY(endY);
   }
   public void setEndXY(int endX, int endY) { 
	   setXY(endX, endY);
   }
   
   public int getLength() { 
	   return (int) Math.sqrt((getEndX()-getBeginX())*(getEndX()-getBeginX()) + (getEndY()-getBeginY())*(getEndY()-getBeginY()));
   }       // Length of the line
   public double getGradient() { 
	   return Math.atan2((getEndY()-getBeginY()), (getEndX()-getBeginX()));
   }  // Gradient in radians
   
   
}