package qa.com.person;

import java.util.ArrayList;
import java.util.List;

public class Person {

	//creating attributes
	private String name;
	private int age;
	private String jobTitle;
	private Pet pet;
	
	//toString to display the attributes
	@Override
	public String toString() {
		if (this.pet == null ) {
		return "This person's name is " + name + ", their age is " + age + ", and their job title is " + jobTitle;
	} else {
		return "This person's name is " + name + ", their age is " + age + ", their job title is " + jobTitle + ", and their pet is " + pet.getName();
	}
	}

	//default constructor
	public Person() {}
	
	//constructor
	public Person(String name, int age, String jobTitle) {
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}
	
	
	//getters and setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}
	
	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}
	
	
	
}
	
	

