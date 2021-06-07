package org.aline.student.controler;

import java.util.List;

import org.aline.student.bean.Student;
import org.aline.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class StudentControler {
	@Autowired
	private StudentService studentservice;

	@RequestMapping(value = "/getstudents", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Student> getAllstudents() {
		return studentservice.getStudents();

	}

	@RequestMapping(value = "/addstudent", method = RequestMethod.POST, headers = "Accept=application/json")
	public Student addStudent(@RequestBody Student stdo) {

		return studentservice.addStudent(stdo);
	}

	@RequestMapping(value = "/updatestudent", method = RequestMethod.PUT, headers = "Accept=application/json")
	public Student updateStudent(@RequestBody Student usdto) {
		return studentservice.updateStudent(usdto);

	}

	 @RequestMapping(value = "/delstudent/{sid}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	    public void deleteStudent(@PathVariable("sid") int sid) {
		  studentservice.deleteStudent(sid);
	 
	    } 
	 
	 @RequestMapping(value = "/getstudent/{sid}", method=RequestMethod.GET, headers = "Accept=application/json")
	    public Student getStudentById(@PathVariable int sid) {
	        return studentservice.getStudentbyId(sid);
	    }

}
