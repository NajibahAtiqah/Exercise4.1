package Exrcs4;

public class Main {

	public static void main(String[] args) {
		Fruits obj1 = new Fruits("Fruit");
		System.out.println(obj1);
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");
		
		Grape obj2= new Grape("Grape", "Purple", 104, 27);
		System.out.println(obj2);
		System.out.println(obj2.getName()+ " contains " + obj2.getCalories() + "kCal" + " and " + obj2.getVitaC()+ "% vitamin C of the Reference Daily Intake (RDI)" + "\n");
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");

		Mango obj3= new Mango("Mango", 0.3);
		System.out.println(obj3);
		System.out.println();
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");

		Apples obj4 = new Apples("Apple",5,3);
		System.out.println(obj4);
		System.out.println("Total price of apple fruit is: " + "RM" +obj4.TotalPrice());
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");

		GrannySmith obj5 = new GrannySmith("Granny Smith", 2, 2, 0.1);
		System.out.println(obj5);
		System.out.println("Total discount received: " + "RM" +obj5.TotalDiscount());
		System.out.println("Total need to pay: " + "RM" + obj5.TotalPaid()+"\n");
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");

		FujiApple obj6 =new FujiApple("Fuji", 10, 5, 152, 7, 24, 13);
		System.out.println(obj6);
		System.out.println("Total weight: " + obj6.TotalWeight() + "grams");
		System.out.println("<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>");

	}
}
