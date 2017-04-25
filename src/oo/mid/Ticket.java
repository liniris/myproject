package oo.mid;

public class Ticket {
	int id;
	String name;
	float price;
	 public Ticket(int id,String name,float price){
		 this.id = id;
		 this.name = name;
		 this.price = price;
		 
	 }
	 public void getId(int id){
		 this.id = id;
	 }
	 public void setId(int id){
		 this.id = id;
	 }
	 public void getName(String name){
		 this.name = name;
	 }
	 public void setName(String name){
		 this.name = name;
	 }
	 public void getPrice(float price){
		 this.price = price;
	 }
	 public void setPrice(float price){
		 this.price = price;
	 }
}
