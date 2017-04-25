package oo.stati;

public class Student {
	int english;
	int math;
	int chinese;
	static int pass = 60;
	static{
    	System.out.println("static!!");
    	System.out.println(pass);
    	//System.out.println(english);無法使用 因為
    }//物件還沒生成就會被執行 
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
