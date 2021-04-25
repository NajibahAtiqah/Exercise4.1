package Exrcs4;

public class Mango extends Fruits {
private double mass;
	
	public Mango(String name, double mass) {
		super(name);
		this.mass=mass;
	}
	
	public double getWeight() { //Convert weight to Newton
		return mass*9.8; 
	}
	
	public String toString() {
		
		return  super.toString()+"\n"+
				super.getName()+" Mass: " +mass + " KG" +"\n"+
				super.getName()+" Mass in Newton: " +getWeight() + " N";

}
}
