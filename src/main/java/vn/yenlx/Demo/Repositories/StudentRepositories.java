package vn.yenlx.Demo.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import vn.yenlx.Demo.Entities.Student;

@Repository
public interface StudentRepositories extends JpaRepository<Student, Integer> {
	
	@Query("from Student")
	List<Student> getAll();

}
