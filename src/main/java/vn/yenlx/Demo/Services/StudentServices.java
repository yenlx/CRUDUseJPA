package vn.yenlx.Demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.yenlx.Demo.Entities.Student;

@Service
public interface StudentServices {
	List<Student> getLstStudent();

	void updateStudent(Student student);
	
	void deleteStudent(int id);
	
	void addStudent(Student student);
	
	Student getOneStudent(int id);
}
