package oo.stati;

public class GraduateStudent extends Student {
	int thesis;
	public GraduateStudent(int english, int math, int chinese) {
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	@Override //複寫檢查
	public void print() {
		System.out.println(getScore(english) + "\t" + getScore(math) 
		+ "\t" + getScore(chinese)+"\t"+thesis);
		// public 加static void print印不出field裡面的東西
	}

	
	
}
