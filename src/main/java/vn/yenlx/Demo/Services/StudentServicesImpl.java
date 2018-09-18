package vn.yenlx.Demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import vn.yenlx.Demo.Entities.Student;
import vn.yenlx.Demo.Repositories.StudentRepositories;

@Component
@Transactional
public class StudentServicesImpl implements StudentServices {

	@Autowired
	StudentRepositories studentDAO;
	
	@Override
	public List<Student> getLstStudent() {
		return studentDAO.getAll();
	}

	@Override
	public void updateStudent(Student student) {
		Optional<Student> st  =  studentDAO.findById(student.getId());
		if(st.isPresent()) {
			Student stu = st.get();
			stu.setName(student.getName());
			stu.setAge(student.getAge());
			studentDAO.saveAndFlush(stu);
		}
		
	}

	@Override
	public void deleteStudent(int id) {
		studentDAO.deleteById(id);
		
	}

	@Override
	public void addStudent(Student student) {
		studentDAO.saveAndFlush(student);
		
	}

	@Override
	public Student getOneStudent(int id) {
		Optional<Student> student = studentDAO.findById(id);
		if(student.isPresent()) {
			return student.get();
		}
		else return null;
		
	}

}
