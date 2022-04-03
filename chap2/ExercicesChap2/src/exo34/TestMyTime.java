package exo34;

public class TestMyTime {
	public static void main(String[] args) {
		MyTime t1 = new MyTime(12,3,47);
		
		System.out.println(t1); //12:3:47
		t1.setTime(23,59,59);
		System.out.println(t1); //23:59:59
		System.out.println(t1.nextSecond()); //23:59:0
		System.out.println(t1.nextMinute()); //23:0:0
		System.out.println(t1.nextHour()); //0:0:0
		
		System.out.println(t1.previousSecond()); //0:0:59
		System.out.println(t1.previousMinute()); //0:59:59
		System.out.println(t1.previousHour()); //23:59:59
		
		
	}
}
