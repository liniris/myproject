package oo.fin;

public class PaperCus extends Customer {
	int paperrMoney = 20;
	public PaperCus(String flower, String paper) {
		super(flower);
		this.paper = paper;
	}

	@Override
	public void print() {
		System.out.println(flower + "\t" + paper + "\t" + card + "\t" + (money + paperrMoney));
	}

}
