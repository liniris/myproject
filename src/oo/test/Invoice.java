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
		int c = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入發票號碼: ");
		String s = scanner.nextLine();
		String nu = s.substring(s.length() - 3);
		// String st = Integer.toString(n);
		for (int i = 0; i < 4; i++) {
			if (nu.equals(a.get(i))) {
				System.out.println("中獎");
				break;
			} else {
				c = c + 1;
			}
			if (c == 4) {
				System.out.println("沒中獎");
			}
//			System.out.println(a.get(i));
//			System.out.println(nu);
//			System.out.println(c);
		}

	}

}
