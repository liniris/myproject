package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Invoice {

	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList();
		a.add("331");
		a.add("821");
		a.add("886");
		a.add("554");

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入發票號碼: ");
		String s = scanner.nextLine();
		String nu = s.substring(s.length()-3);
		//String st = Integer.toString(n);
		for (int i = 0; i < 4; i++) {
			if (nu == a.get(i)) {
				System.out.println("中獎");
			}

		}

	}

}
