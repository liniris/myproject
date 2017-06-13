package oo.test;

public class Member {
	String id;
	private int age;
	String name;
	public Member(){
		
	}//再一個空的建構子對應super()
	public Member(String name){
		System.out.println("member construct");
		this.name = name;
	}
	public void setAge(int age){
		if(age<0){
			age = 0;
		}
		this.age = age;
	}
	public int getAge(){
		return age;
	}
}
