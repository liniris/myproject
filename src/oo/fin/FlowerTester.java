package oo.fin;

import java.util.ArrayList;

public class FlowerTester {

	public static void main(String[] args) {
		System.out.println("花種" + "\t" + "包裝顏色" + "\t" + "加購卡片"+"\t"+"總金額");
		ArrayList<Customer> list = new ArrayList();
		list.add(new Customer("向日葵"));
		list.add(new PaperCus("白百合","咖啡色"));
		list.add(new PaperCus("康乃馨","粉紅色"));
		list.add(new CardCus("粉紅牡丹","紫色"));
		list.add(new PaperCus("紅玫瑰","黑色"));
		list.add(new Customer("藍繡球"));
		
		for (int i = 0; i < list.size(); i++) {
			Customer cus = list.get(i);
			cus.print();
	}
	}
}
