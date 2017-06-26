package oo.fin;

public class CardCus extends Customer {
	int cardMoney = 10;

	public CardCus(String flower, String paper) {
		super(flower);
		this.paper = paper;
		this.card = card;
		card = true;
	}

	@Override
	public void print() {
		System.out.println(flower + "\t" + paper + "\t" + card + "\t" + (money + 20 + cardMoney));
	}

}
