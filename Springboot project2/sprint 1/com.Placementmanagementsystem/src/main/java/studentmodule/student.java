package studentmodule;
import javax.persistence.*;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import model.GeneratedValue;
import model.Id;

@EntityScan
@Table(name = "students")
public class student {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private String password;
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	private String department;
    private String resume;

    public Student() {}

    public Student(String name, String email, String password, String department, String resume) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.department = department;
        this.resume = resume;

}
