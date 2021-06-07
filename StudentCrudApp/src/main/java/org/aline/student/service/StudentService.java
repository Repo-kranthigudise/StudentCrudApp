package org.aline.student.service;

import java.util.List;

import org.aline.student.bean.Student;
import org.aline.student.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

	@Autowired
	private StudentDao studentDao;

	public Student addStudent(Student sdto) {
		return studentDao.addStudent(sdto);

	}

	public List<Student> getStudents() {

		return studentDao.getAllStudents();
	}

	public Student updateStudent(Student usdto) {
		return studentDao.updateStudent(usdto);

	}

	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);

	}

	public Student getStudentbyId(int id) {

		return studentDao.getStudendbById(id);
	}

}
