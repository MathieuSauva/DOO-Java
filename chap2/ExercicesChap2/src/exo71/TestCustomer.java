package exo71;

public class TestCustomer {
	public static void main(String[] args) {
		Customer c1 = new Customer();
	    System.out.println(c1.toString());
	    
	    c1.setMemberType(null);
	    c1.setMember(false);
	    System.out.println(c1.toString());
	    
	}
}
