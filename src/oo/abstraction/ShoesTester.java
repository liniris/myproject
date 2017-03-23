package oo.abstraction;

public class ShoesTester {

	public static void main(String[] args) {
		Shoes s1 = new Shoes("Mizuno",24.5f,"jogging","white");
		Shoes[] s = new Shoes[3];
		s[0] = new Shoes("Mizuno",24.5f,"jogging","white");
		s[1] = new Shoes("Nike",25f,"jogging","black");
		s[2] = new Shoes("Adiads",24f,"walk","blue");
		s[0].money = 3000;
		s[1].money = 3200;
		s[2].money = 2800;
		
		int i;
		for(i=0;i<3;i++){
			System.out.println(s[i].money);
		}
	}

}
