package impl;

import skeleton.Person;
import java.util.UUID;

public class Employee extends Person {


	UUID ID;
	String department;
	String jobDescription;

	public Employee(String firstName, String lastName, int age, String department, String jobDescription) {
		super(firstName, lastName, age);
		ID = UUID.randomUUID();
		this.department = department;
		this.jobDescription = jobDescription;
	}

	public void printEmployee() {
		System.out.println("-------------------------------------");
		System.out.println("Employee Overview");
		System.out.println("Name: " + firstName + " " + lastName);
		System.out.println("Age: " + age);
		System.out.println("Company ID: " + ID);
		System.out.println("Department: " + department);
		System.out.println("Job description: " + jobDescription);
		System.out.println("-------------------------------------");
	}

	@Override
	public String toString() {
		return "Employee{" +
				"firstName='" + firstName + '\'' +
				", lastName='" + lastName + '\'' +
				", age=" + age +
				", ID=" + ID +
				", department='" + department + '\'' +
				", jobDescription='" + jobDescription + '\'' +
				'}';
	}
}
