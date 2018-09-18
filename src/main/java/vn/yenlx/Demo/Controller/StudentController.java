package vn.yenlx.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.yenlx.Demo.Entities.Student;
import vn.yenlx.Demo.Services.StudentServices;

@RestController
@RequestMapping("/student")
public class StudentController {

	@Autowired
	StudentServices services;
	
	@GetMapping(value = "/getStudent")
	public List<Student> getStudent(){
		return services.getLstStudent();
	}
	@GetMapping(value = "/getOneStudent/{id}")
	public Student getOneStudent(@PathVariable(name="id") int id) {
		return services.getOneStudent(id);
	}
	@PostMapping(value = "/addStudent")
	public void addStudent(@ModelAttribute Student student) {
		services.addStudent(student);
		return;
	}
	
	@DeleteMapping(value="/deleteStudent/{id}")
	public void deleteStudent(@PathVariable(name="id") int id) {
		services.deleteStudent(id);
	}
	@PutMapping(value="/updateStudent")
	public void updateStudent(@ModelAttribute Student student) {
		services.updateStudent(student);
	}
}
