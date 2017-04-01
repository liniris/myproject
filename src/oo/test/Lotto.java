package oo.test;

import java.util.ArrayList;
import java.util.Scanner;

public class Lotto {

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
		boolean t = false;
		for (int i = 1; i < 7; i++) {
			
				Scanner scanner = new Scanner(System.in);
				System.out.println("請輸入您的第" + i + "個號碼: ");
				String s = scanner.nextLine();
				for (int j = 0; j < 6; j++) {
				if(s.equals(b.get(j))){
					c++;
				}
				if(s.equals(b.get(6))){
					 t = true;
				}
			}
		}
		System.out.print("恭喜您中了"+c+"個號碼");
		if(t ==true && c>=2){
			System.out.println("及特別號");
		}else {
			System.out.println("再加油瞜");
		}
	}
}
