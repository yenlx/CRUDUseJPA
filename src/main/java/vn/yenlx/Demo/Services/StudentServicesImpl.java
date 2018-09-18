package vn.yenlx.Demo.Services;

import java.util.List;

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
		return studentDAO.findAll();
	}

}
