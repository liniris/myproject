package oo.stati;

public class Test {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1 = new Student(55, 67, 89);
		Student stu2 = new Student(68, 85, 58);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
	}

}
