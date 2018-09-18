package vn.yenlx.Demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@PostMapping(value = "/addStudent")
	public void addStudent(@ModelAttribute Student student) {
		String a ="123";
		return;
				
	}
}
