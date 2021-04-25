package Exrcs4;

public class Fruits {
	
private String name;
	
	public Fruits(String name) {
		this.name = name;
		System.out.println(name + " constructor is invoked");

}
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "We should take " + name + " as our daily intake.";
}
}