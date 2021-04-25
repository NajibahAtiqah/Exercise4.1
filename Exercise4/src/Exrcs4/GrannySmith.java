package Exrcs4;

public class GrannySmith extends Apples {
private double discount;
	
	public GrannySmith(String name, int q, int p, double d) {
		super(name,q,p);
		this.discount = d;
	}
	
	public double getDiscount() {
		return discount;

	}
	
	public double TotalDiscount() {
		return super.getQuantity()*getPrice()*getDiscount();
	}
	public double TotalPaid() {
		return (getQuantity()*getPrice())-TotalDiscount();
	}
	
	public String toString() {
		return super.toString()+"\n"+ "Discount given: " +getDiscount()+ " %" + "\n";
}
}
