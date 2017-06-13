package oo.test;

public class PhoneMember extends Member{
	String phone;
	boolean verified = false;
	
	public PhoneMember(String name){
		super(name);
	}
	public PhoneMember(){
		super();
	}
	
	public String getPhone(){
		return phone;
	}
	
	public void setPhone(String phone){
		this.phone = phone;
	}
	public boolean isverified(){
		return verified;
	}
	public void setVerified(){
		this.verified = verified;
	}
}
