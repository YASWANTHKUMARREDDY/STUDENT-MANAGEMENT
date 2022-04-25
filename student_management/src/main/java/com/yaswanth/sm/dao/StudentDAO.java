/**
 * 
 */
package com.yaswanth.sm.dao;

import java.util.List;

import com.yaswanth.sm.api.Student;

/**
 * @author Yaswanth Kumar Reddy Poola
 *
 *
 */
public interface StudentDAO {

	List<Student> loadStudents();
	
}
