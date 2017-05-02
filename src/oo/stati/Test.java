package oo.stati;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		System.out.println(Student.pass);
		Student stu1 = new Student(55, 67, 89);
		Student stu2 = new Student(68, 85, 58);
		Student stu3 = new Student(78, 65, 88);
		stu1.pass = 70;
		stu1.print();
		stu2.print();
		GraduateStudent gust1 = new GraduateStudent(65,85,76);
		GraduateStudent gust2 = new GraduateStudent(68,75,86);
		gust1.print();
		ArrayList<Student> list = new ArrayList();
		list.add(new Student(55, 67, 89));
		list.add(new Student(68, 85, 58));
		list.add(new Student(78, 65, 88));
		list.add(new GraduateStudent(65,85,76));
		list.add(new GraduateStudent(68,75,86));
		for(int i=0;i<list.size();i++){
			Student stu = list.get(i);
			stu.print();
		}
	}

}
