/**
 * 
 */
package com.yaswanth.sm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.yaswanth.sm.api.Student;
import com.yaswanth.sm.dao.StudentDAO;

/**
 * @author Yaswanth Kumar Reddy Poola
 *
 *
 */

@Controller
public class StudentControllers {

	@Autowired
	private StudentDAO studentDAO;
	
	@RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String showStudentList() {
		
		List<Student> studentsList = studentDAO.loadStudents();
		
		return "student-list";
	}

}
