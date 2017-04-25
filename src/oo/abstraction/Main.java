package oo.abstraction;

public class Main {

	public static void main(String[] args) {
		Car c1 = new Car("Toyota","Altis",1800 , "Sedan");
		c1.setMilage(20000);
		
		float current = c1.addMilage(50);
		System.out.println("目前里程數為: " + current);
		float current1 = c1.addMilage(-50);
		System.out.println("目前里程數為: " + current1);

	}

}
