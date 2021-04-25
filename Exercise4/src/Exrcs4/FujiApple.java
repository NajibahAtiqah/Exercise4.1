package Exrcs4;

public class FujiApple extends Apples {
	private int weight;
	private int tall;
	private int maxgrowth;
	private int mingrowth;
	

	
	public FujiApple (String name, int q, int p, int w, int t, int a, int b) {
		super(name,q,p);
		this.weight = w;
		this.tall=t;//in feet
		this.maxgrowth = a;
		this.mingrowth = b;
		
	}
	
	public int getWeight() {
		return weight;
	}
	
	public double CalAgeOfAppleTreeMax() {
		return (tall*12)/maxgrowth;
	}
	
	public double CalAgeOfAppleTreeMin() {
		return (tall*12)/mingrowth;
	}
	
	public int TotalWeight() {
		return super.getQuantity()*weight;
	}
	
	public String toString() {
		return super.toString()+"\n"+ "Weight : " +weight + " grams" + "\n"+
				"Estimated age of tree is in between: " +CalAgeOfAppleTreeMin() + " to " +CalAgeOfAppleTreeMax() + " years" +"\n";
}
}
