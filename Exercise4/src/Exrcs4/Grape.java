package Exrcs4;

public class Grape extends Fruits {
	private String colour;
	private int calories, vitaC;
	
	public Grape(String name,String colour,int calories,int vitaC) {
		super(name);
		this.colour = colour;
		this.calories=calories;
		this.vitaC=vitaC;
	}
	
	public int getCalories() {
		return calories;
	}
	
	public int getVitaC() {
		return vitaC;
	}
	
	
	public String toString() {
		
		return  super.toString()+"\n"+ "The grape colour is: "+colour;
}
}
