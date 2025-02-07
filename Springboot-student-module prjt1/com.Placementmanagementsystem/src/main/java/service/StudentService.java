package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import model.Student;
import repository.StudentRepository;

import java.util.List;

@Service

public class StudentService {
	 @Autowired
	    private StudentRepository studentRepository;

	    public List<Student> getAllStudents() {
	        return studentRepository.findAll();
	    }

	    public Student getStudentByEmail(String email) {
	        return studentRepository.findByEmail(email);
	    }

	    public Student saveStudent(Student student) {
	        return studentRepository.save(student);
	    }

}
