package oo.fin;

public class Customer extends Flower{
	public Customer() {
		super();
	}
	int money = 200;
	String flower;
	String paper;
	boolean card = false;
	
	public Customer(String flower){
		this.flower = flower;
		this.paper = paper;
		this.card = card;
	}
	
	public void print(){
		System.out.println(flower + "\t" + "no" + "\t" + card +"\t"+ money);
	}
}
