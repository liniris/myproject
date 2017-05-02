package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

//銝雿輻 ����
import oo.abstraction.*;
import oo.stati.Student;


public class Tester {

	public static void main(String[] args) {
		Car c = new Car("Toyota", "car", 2000, "van");
		//public��镼踹銝�ackage鋆⊿�雿輻
	
	ArrayList<String> a = new ArrayList();
	//<>鋆⊥鞈���� 銋��dd()撠望�◤��
	a.add("331");
	a.add("453");
	a.add("886");
	System.out.println(a.size());
	a.add("554");
//	System.out.println(a.size());
	a.set(2, "821");
	System.out.println(a);
	String data = (String)a.get(0);
	//鞈��靘�閬���
	//int n = (int)a.get(1);
	String data1 = (String)a.get(1);
	
	Scanner scanner = new Scanner(System.in);
	System.out.println(" ");
	String s = scanner.nextLine();
	int type = Integer.parseInt(s);
	s = scanner.nextLine();
	}
	//Student stu = new Student(); //Student有public 才能import
	
}
