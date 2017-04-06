package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Lotto2 {

	public static void main(String[] args) {
		ArrayList<String> b = new ArrayList<>();
		b.add("17");
		b.add("18");
		b.add("22");
		b.add("24");
		b.add("25");
		b.add("38");
		b.add("39");
		int c = 0;
		boolean sp = false;

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入您的6個號碼,以空白鍵隔開(ex:02 12 32...): ");
		String s = scanner.nextLine();
		String t1 = s.substring(0, 2);
		String t2 = s.substring(3, 5);
		String t3 = s.substring(6, 8);
		String t4 = s.substring(9, 11);
		String t5 = s.substring(12, 14);
		String t6 = s.substring(15, 17);

		System.out.println(t1 + " " + t2 + " " + t3 + " " + t4);

		for (int i = 0; i < 6; i++) {
			if (t1.equals(b.get(i))) {
				c++;
			}
			if (t2.equals(b.get(i))) {
				c++;
			}
			if (t3.equals(b.get(i))) {
				c++;
			}
			if (t4.equals(b.get(i))) {
				c++;
			}
			if (t5.equals(b.get(i))) {
				c++;
			}
			if (t6.equals(b.get(i))) {
				c++;
			}
		}
		if (c >= 2) {
			System.out.print("中" + c + "個號碼");
		}
		if (c >= 2 && (t1.equals(b.get(6)) || t2.equals(b.get(6)) || t3.equals(b.get(6)) || t6.equals(b.get(6))
				|| t4.equals(b.get(6)) || t5.equals(b.get(6)))) {
			System.out.println("及特別號");
		} else {
			System.out.println("請再加油");

		}
	}
}
