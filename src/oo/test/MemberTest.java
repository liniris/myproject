package oo.test;

public class MemberTest {

	public static void main(String[] args) {
		Member member = new Member("Iris");
		member.setAge(-5);
		System.out.println(member.getAge());
		
		//Phone Member
		PhoneMember member2 = new PhoneMember();
		PhoneMember member3 = new PhoneMember("Andy");
	}

}
