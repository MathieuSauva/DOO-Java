package exo71;

public class DiscountRate {
	private static double serviceDiscountPremium;
	private static double serviceDiscountGold;
	private static double serviceDiscountSilver;
	private static double productDiscountPremium;
	private static double productDiscountGold;
	private static double productDiscountSilver;
	
	public DiscountRate() {
		serviceDiscountPremium = 0.2;
		serviceDiscountGold = 0.15;
		serviceDiscountSilver = 0.1;
		productDiscountPremium = 0.1;
		productDiscountGold = 0.1;
		productDiscountSilver = 0.1;
	}
	
	public static double getServiceDiscountRate(String type) {
		if(type == "Premium") {return serviceDiscountPremium;}
		if(type == "Gold") {return serviceDiscountGold;}
		if(type == "Silver") {return serviceDiscountSilver;}
		else
			return 1;
	}
	
	public static double getProductDiscountRate(String type) {
		if(type == "Premium") {return productDiscountPremium;}
		if(type == "Gold") {return productDiscountGold;}
		if(type == "Silver") {return productDiscountSilver;}
		else
			return 1;
	}
	

}
