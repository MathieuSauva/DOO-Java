package exo51;

public class TestLineSub {
   public static void main(String[] args) {
      LineSub l1 = new LineSub(0, 0, 3, 4);
      System.out.println(l1);
   
      Point p1 = new Point(50, 5);
      Point p2 = new Point(100, 10);
      LineSub l2 = new LineSub(p1, p2);
      System.out.println(l2.getEnd());
      System.out.println(l2.getLength());
      System.out.println(l2.getGradient());
      
   }
}