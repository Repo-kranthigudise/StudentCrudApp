package org.aline.student.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.aline.student.bean.Student;
import org.springframework.stereotype.Repository;
@Repository
public class StudentDao {

	HashMap<Integer, Student> slist = new HashMap<>();
	
	//Adding student into hashmap

	public Student addStudent(Student std) {
		slist.put(std.getsId(), std);
		return std;
	}
	
	//getting All students from hashmap
	
	public List<Student> getAllStudents(){
		List<Student> alllist=new ArrayList<>(slist.values());
			return alllist;
	}

	//get student based on student Id
	
	public Student getStudendbById(int i) {
		Student ls = slist.get(i);
		return ls;
	}

	//updating student based on previous sId
	public Student updateStudent(Student ustd) {
		if (ustd.getsId() <= 0) {
			return null;
		}
		slist.replace(ustd.getsId(), ustd);
		return ustd;

	}

	//removing studentObject from hashmap
	public void deleteStudent(int i) {
		slist.remove(i);
	}
}
