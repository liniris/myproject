package oo.abstraction;

public class CarTester {

	public static void main(String[] args) {
		
		Car c1 = new Car("Toyota", "ACCORD", 1800, "Sedan");
		Car c2 = new Car("HONDA", "ACCORD",2000 , "Sedan");
		Car c3 = new Car("Toyota", "WISH", 1800, "Sedan");
		int[] n = new int[5];
		System.out.println(n[2]);

		Car[] cars = new Car[3];
		System.out.println(cars[0]);
		cars[0] =  new Car("Toyota", "ACCORD", 1800, "Sedan");
		cars[1] = new Car("HONDA", "ACCORD",2000 , "Sedan");
		cars[2] = new Car("Toyota", "WISH", 1800, "Sedan");
		cars[0].id = 301;
		cars[1].id = 400;
		cars[2].id = 403;
		
		System.out.println(cars[0].brand);
		int i = 0;
		//x的生存區域
		for (i = 0; i < 3; i++) {
			System.out.println(cars[i].brand);
			int x = 0;
		}//x的生存區域
		System.out.println(i);
		
		class AA{
			
		}
		AA a = new AA();
	}
}
