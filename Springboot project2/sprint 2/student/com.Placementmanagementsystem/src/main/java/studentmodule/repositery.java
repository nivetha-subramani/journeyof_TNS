package studentmodule;

import model.Student;
import repository.JpaRepository;

public interface repositery extends JpaRepository<Student, Long> {
	Student findByEmail(String email);
}
