package Exrcs4;

public class Apples extends Fruits {
	private int quantity;
	private int price;
	
	public Apples (String name,int q, int p) {
		super(name);
		this.quantity=q;
		this.price=p;
}
	
	public int getQuantity() {
		return quantity;
	}
	
	public double getPrice() {
		return price;
	}
	
	public int TotalPrice() {
		return quantity*price;
	}
	
	public String toString() {
		return  super.toString()+"\n"+
				super.getName()+" quantity of fruit : "+quantity+"\n"+
				super.getName()+" price is : " + "RM" +price;
		
}
}
