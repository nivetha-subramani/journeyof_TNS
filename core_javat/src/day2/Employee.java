package day2;

public class Employee{
	// data menters in private
	// and getters and setters
	private int eid;
	private String ename;
	private String city;
	public int getEid() {
	return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	//to string method
	@Override
	//anotation it helps to the documentation & tell the information to the complier
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", city=" + city + "]";
	}

}
