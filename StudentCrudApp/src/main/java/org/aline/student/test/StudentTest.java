package org.aline.student.test;

import org.aline.student.bean.Student;
import org.aline.student.dao.StudentDao;

public class StudentTest {

	public static void main(String[] args) {
		StudentDao sdao = new StudentDao();
		Student std = new Student(1, "kra", "g", "cse", 85.00);
		Student std1 = new Student(2, "shiva", "b", "cse", 95.00);
		Student std2 = new Student(3, "naareesh", "m", "it", 65.00);
		Student std3 = new Student(4, "sriram", "n", "bse", 75.00);
		

		// add student to map
		sdao.addStudent(std);
		sdao.addStudent(std1);
		sdao.addStudent(std2);
		sdao.addStudent(std3);
		System.out.println("added list");
		System.out.println();
		
		//get All Students from list
		System.out.println("getting all student list");
		System.out.println(sdao.getAllStudents());

		// get students by one
		System.out.println("getting stundt by one \n");
		Student stg = sdao.getStudendbById(1);
		System.out.println(stg);
		System.out.println("\n");

		// updating Slist
		System.out.println("upadting student");
		Student ustd = new Student(1, "kranthi", "gudise", "cse", 85.00);
		Student us = sdao.updateStudent(ustd);
		System.out.println(us);
		System.out.println();
		
		// remove student from map
		sdao.deleteStudent(1);
		System.out.println("removed");

		// recheking
		Student st = sdao.getStudendbById(1);
		System.out.println(st);
		System.out.println();

	}
}
