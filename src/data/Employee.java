package data;

public class Employee {
	
	
	
	public Employee() {
	
	}


	private Integer id;
	private String firstname;
	private String middlename;
	private	String lastname;
	private String gender;
	private String email;
	private Integer extention;
	private String hiredate;
	private Integer salary;
	private Integer commission_pct;
	private Integer department_id;
	private Integer job_id;
	private String address;
	private String city;	
	private String state;	
	private Integer zipcode;
	private Integer version;
	


	
	
	
	public Employee(Integer id, String firstname, String middlename, String lastname, String gender, String email,
			Integer extention, String hiredate, Integer salary, Integer commission_pct, Integer department_id,
			Integer job_id, String address, String city, String state, Integer zipcode, Integer version) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
		this.gender = gender;
		this.email = email;
		this.extention = extention;
		this.hiredate = hiredate;
		this.salary = salary;
		this.commission_pct = commission_pct;
		this.department_id = department_id;
		this.job_id = job_id;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.version = version;
	}


	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getMiddlename() {
		return middlename;
	}



	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}



	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getExtention() {
		return extention;
	}







	public void setExtention(Integer extention) {
		this.extention = extention;
	}







	public String getHiredate() {
		return hiredate;
	}







	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}







	public Integer getSalary() {
		return salary;
	}







	public void setSalary(Integer salary) {
		this.salary = salary;
	}







	public Integer getCommission_pct() {
		return commission_pct;
	}







	public void setCommission_pct(Integer commission_pct) {
		this.commission_pct = commission_pct;
	}







	public Integer getDepartment_id() {
		return department_id;
	}







	public void setDepartment_id(Integer department_id) {
		this.department_id = department_id;
	}







	public Integer getJob_id() {
		return job_id;
	}







	public void setJob_id(Integer job_id) {
		this.job_id = job_id;
	}







	public String getAddress() {
		return address;
	}







	public void setAddress(String address) {
		this.address = address;
	}







	public String getCity() {
		return city;
	}







	public void setCity(String city) {
		this.city = city;
	}







	public String getState() {
		return state;
	}







	public void setState(String state) {
		this.state = state;
	}







	public Integer getZipcode() {
		return zipcode;
	}







	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}







	public Integer getVersion() {
		return version;
	}







	public void setVersion(Integer version) {
		this.version = version;
	}







	@Override
	public String toString() {
		return id + "firstname" + firstname + ", middlename=" + middlename + ", lastname="
				+ lastname + ", gender=" + gender + ", email=" + email + ", extention=" + extention + ", hiredate="
				+ hiredate + ", salary=" + salary + ", commission_pct=" + commission_pct + ", department_id="
				+ department_id + ", job_id=" + job_id + ", address=" + address + ", city=" + city + ", state=" + state
				+ ", zipcode=" + zipcode + ", version=" + version + "";
	}
	
	
}