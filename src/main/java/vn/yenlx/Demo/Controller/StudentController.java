package vn.yenlx.Demo.Controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.spi.DirStateFactory.Result;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	@PostMapping(value="/validate")
	public  ResponseEntity<Object> check(@Valid @RequestBody Student student ,  BindingResult bindingResult)
	{
		if(!bindingResult.hasErrors()) {
			return new ResponseEntity<Object>(HttpStatus.OK);
		}
		else {
			bindingResult.getFieldErrors().stream().forEach(x -> System.out.println(x.getDefaultMessage().toString()));
			Map<String,Object> result  = new HashMap<>();
			return new ResponseEntity<Object>(result.put("data", bindingResult.getFieldErrors()),HttpStatus.BAD_REQUEST);
		}
	}
}
