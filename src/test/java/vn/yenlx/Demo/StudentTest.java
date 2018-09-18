package vn.yenlx.Demo;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import vn.yenlx.Demo.Entities.Student;
import vn.yenlx.Demo.Repositories.StudentRepositories;
import vn.yenlx.Demo.Services.StudentServices;
import vn.yenlx.Demo.Services.StudentServicesImpl;

@RunWith(SpringRunner.class)
public class StudentTest {

    @TestConfiguration
    static class StudentServicesImplTestContextConfiguration {
  
        @Bean
        public StudentServices studentServices() {
            return new StudentServicesImpl();
        }
    }
    @Autowired
    private StudentServices studentService;
 
    @MockBean
    private StudentRepositories studentRepository;
    
    @Test
	public void getOneStudent() {
		Student student = studentService.getOneStudent(1);
		 assertThat(student.getName())
	      .isEqualTo("admin111");
		
	}
	
}
