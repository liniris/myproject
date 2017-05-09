package oo.shopping;

public class SilverCustomer extends Customer{
	public SilverCustomer(){
		super();
	}
	float sale = 0.9f;
	public SilverCustomer(int money){
		this.money = money;
	}
	
	public void print() {
		System.out.println(money+"\t"+sale*money);
	}
}
