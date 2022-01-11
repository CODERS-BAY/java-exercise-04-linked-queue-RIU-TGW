package application;

import impl.Employee;
import impl.QueueImpl;
import skeleton.Person;
import skeleton.Queue;

public class Main {

	public static void main(String[] args) {
		Employee testSubject = new Employee("Lukas", "Roithmeier", 24, "SYEC", "Daumendrehn");

		testSubject.printEmployee();
		System.out.println(testSubject.toString());
	}

}
