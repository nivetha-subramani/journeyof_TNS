package studentmodule;

import placement.GeneratedValue;
import placement.ID;
import jakarta.persistance.*;

public class configure {
	@ID
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private String companyName;
	private String positon;
	private String location;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getPositon() {
		return positon;
	}
	public void setPositon(String positon) {
		this.positon = positon;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getSalaryPackage() {
		return salaryPackage;
	}
	public void setSalaryPackage(String salaryPackage) {
		this.salaryPackage = salaryPackage;
	}
	public String getDriveDate() {
		return driveDate;
	}
	public void setDriveDate(String driveDate) {
		this.driveDate = driveDate;
	}
	private String salaryPackage;
	private String driveDate;
}
