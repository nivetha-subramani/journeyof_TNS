package studentmodule;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import controller.GetMapping;
import controller.PathVariable;
import controller.PostMapping;
import controller.RequestBody;
import model.Student;
import service.StudentService;
import java.util.List;

@RestController
@RequestMapping("/students")
public class controller {
	@Autowired
    private StudentService studentService;

    @GetMapping
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("/register")
    public Student registerStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/{email}")
    public Student getStudentByEmail(@PathVariable String email) {
        return studentService.getStudentByEmail(email);
    }

}
