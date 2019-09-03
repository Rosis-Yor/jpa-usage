package coolschool.jsf_beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the employeeinfo database table.
 * 
 */
@Entity
@Table(name="employeeinfo")
public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;

	
	@Id
	@Column(name = "id")
	private int id;
	
	@Column(name = "age")
	private int age;

	@Column(name = "gender")
	private String gender;

	@Column(name = "location")
	private String location;

	@Column(name = "name")
	private String name;

	public Employee() {
	}

	public int getId() {
		return this.id;
	}

	

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}