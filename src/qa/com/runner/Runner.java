package qa.com.runner;

import java.util.List;
import java.util.Scanner;

import qa.com.person.Person;
import qa.com.person.Pet;

public class Runner {

	public static void main(String[] args) {
		
		Person jim = new Person("Jim", 24, "Musician");
		Person mary = new Person("Mary", 64, "Nurse");
		Person dan = new Person("Dan", 22, "Student");
		Person sam = new Person("Sam", 43, "Dentist");
		Person faye = new Person("Faye", 32, "Therapist");
		
		Pet pet1 = new Pet("Toffee", "Cat");
		Pet pet2 = new Pet("Rosie", "Dog");
		Pet pet3 = new Pet("Bob", "Dog");
		

		List <Person> people = List.of(jim, mary, dan, sam, faye); {
		
		jim.setPet(pet1);
		mary.setPet(pet2);
		faye.setPet(pet3);
		
		for (Person p : people) {
			System.out.println(p);
		}
			
			
//			for (Person p: people) {
//				System.out.println(p);
//			}}
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Who are you looking for?: ");
//		String name = scan.nextLine();
//		
//		if (name.equals("Jim")) {
//			System.out.println(people.get(0));
//		} else if (name.equalsIgnoreCase("Mary")) {
//			System.out.println(people.get(1));
//		} else if (name.equalsIgnoreCase("Dan")) {
//			System.out.println(people.get(2));	
//		} else if (name.equalsIgnoreCase("Sam")) {
//			System.out.println(people.get(3));
//		} else if (name.equalsIgnoreCase("Faye")) {
//			System.out.println(people.get(4));
//		} else {
//			System.out.println("This name does not exist... did you spell it right?");
//		}
//		
//		scan.close();
//	}
		
		
		

}}}
