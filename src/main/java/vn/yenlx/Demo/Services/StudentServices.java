package vn.yenlx.Demo.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import vn.yenlx.Demo.Entities.Student;

@Service
public interface StudentServices {
	List<Student> getLstStudent();
}
