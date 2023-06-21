package one.evospringone.repository;

import one.evospringone.dto.StudentDto;
import one.evospringone.dto.StudentDtoResponse;
import one.evospringone.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {


    List<Student> getByNameIgnoreCase(String name);

    List<Student> getByNameIgnoreCaseAndSurnameIgnoreCase(String name,String surname);
}
