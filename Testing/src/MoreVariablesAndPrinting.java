
public class MoreVariablesAndPrinting {
	public static void main(String[] args) {
		String name, eyes, teeth, hair;
		int age, height, weight;
		
		name = "Gnana sai";
		eyes = "Brown";
		teeth = "White";
		hair = "Black";
		age = 24;
		height = 74;
		weight = 140;
		
		
		double kilos,cms;
		
		kilos= weight*0.45;
		cms=height*2.54;
		
		
		System.out.println("Let's me introduce myslef" +name+".");
		System.out.println("My eyes are " + eyes + "brown in color.");
		System.out.println("My teeth are " + teeth + "white in color");
		System.out.println("My Weight is " + kilos + "kilos.");
		System.out.println("My height is " + cms +"cms.");
		System.out.println("My hair is " + hair + " in color");
		System.out.println("If i add " + age + "," +height+ "," +"and" +weight+" i get"+(age + height + weight));
	}
}
