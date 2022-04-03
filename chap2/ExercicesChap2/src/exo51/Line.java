package exo51;

public class Line {
   // A line composes of two points (as instance variables)
   private Point begin;    // beginning point
   private Point end;      // ending point
   
   // Constructors
   public Line (Point begin, Point end) {  // caller to construct the Points
      this.begin = begin;
      this.end = end;
   }
   public Line (int beginX, int beginY, int endX, int endY) {
      begin = new Point(beginX, beginY);   // construct the Points here
      end = new Point(endX, endY);
   }
   
   @Override
public String toString() {
	return "Line [begin=" + begin + ", end=" + end + "]";
}
   
   public Point getBegin() { 
	   return begin;
   }
   public Point getEnd() {
	   return end;
   }
   public void setBegin(Point begin) { 
	   this.begin = begin;
   }
   
   public void setEnd(Point end) {
	this.end = end;
   }
   public int getBeginX() { 
	   return begin.getX();
   }
   public int getBeginY() { 
	   return begin.getY();
   }
   public int getEndX() {
	   return end.getX();
   }
   public int getEndY() {
	   return end.getY();
   }
   
   public void setBeginX(int x) {
	   begin.setX(x);
   }
   public void setBeginY(int y) {
	   begin.setY(y);
   }
   public void setBeginXY(int x, int y) {
	   begin.setXY(x,y);
   }

   public void setEndX(int x) {
	   end.setX(x);
   }
   public void setEndY(int y) {
	   end.setY(y);
   }
   public void setEndXY(int x, int y) {
	   end.setXY(x, y);
   }

   
   public int getLength() { 
	   double xDiff = end.getX() - begin.getX();
	   double yDiff = begin.getY() - end.getY();
	   return (int) Math.sqrt(xDiff*xDiff + yDiff*yDiff);

   } // Length of the line
                                     // Math.sqrt(xDiff*xDiff + yDiff*yDiff)
   public double getGradient() {
	   double xDiff = end.getX() - begin.getX();
	   double yDiff = begin.getY() - end.getY();
	   return Math.atan2(yDiff, xDiff);
   }// Math.atan2(yDiff, xDiff)
}