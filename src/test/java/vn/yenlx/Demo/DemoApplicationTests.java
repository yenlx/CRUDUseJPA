package vn.yenlx.Demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import vn.yenlx.Demo.Entities.Student;
import vn.yenlx.Demo.Services.StudentServices;

@RunWith(SpringRunner.class)
@DataJpaTest
public class DemoApplicationTests {

	@Autowired 
	StudentServices services;
	@Test
	public void contextLoads() {
	}
	@Test
	public void getOneStudent() {
		Student student = services.getOneStudent(13);
		assertThat(student.getName().equals("admin111"));
		
	}
}
