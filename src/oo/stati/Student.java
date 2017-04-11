package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	public Student(int english,int math, int chinese){
		this.english = english;
		this.math = math;
		this.chinese = chinese;
	}
	public void print(){
		System.out.println(getScore(english)+"\t"+getScore(math)+"\t"+getScore(chinese));
	//public 加static void print印不出field裡面的東西
	}
	
	private String getScore(int score){
		if(score<pass){
			return String.valueOf(score)+"*";
		}else{
			return String.valueOf(score);
		}
	}
}
