package oo.mid;

import java.util.ArrayList;

public class Meal {
	String address;
	String phone;
	 public Meal(String address,String phone){
		 this.address = address;
		 this.phone = phone;
		 
	 }
	public void foods(){
		ArrayList<String> f = new ArrayList();
		f.add("漢堡");
		f.add("炸雞");
		f.add("雞塊");
		f.add("薯條");
		f.add("可樂");
	}
}
