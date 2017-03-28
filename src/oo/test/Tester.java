package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

//下方使用 自動出現
import oo.abstraction.*;


public class Tester {

	public static void main(String[] args) {
		Car c = new Car("Toyota", 2000, "car", "van");
		//public的東西在不同package裡都可使用
	
	ArrayList<String> a = new ArrayList();
	//<>裡放資料型態 之後的add()就會被限制
	a.add("331");
	a.add("453");
	a.add("886");
	System.out.println(a.size());
	a.add("554");
//	System.out.println(a.size());
	a.set(2, "821");
	System.out.println(a);
	String data = (String)a.get(0);
	//資料拿出來需要轉型
	//int n = (int)a.get(1);
	String data1 = (String)a.get(1);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println(" ");
	String s = scanner.nextLine();
	int type = Integer.parseInt(s);
	s = scanner.nextLine();
	}
	
}
