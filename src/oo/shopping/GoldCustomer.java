package oo.shopping;

public class GoldCustomer extends SilverCustomer {
	float cash = 0.05f;
	public GoldCustomer(){
		super();
	}
	public GoldCustomer(int money){
		this.money = money;
	}
	public void print() {
		System.out.println(money+"\t"+sale*money+"\t"+cash*money);
	}
}
