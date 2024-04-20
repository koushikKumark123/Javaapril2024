package comjavatraining.basic;

import java.util.Scanner;

//form creation
public class Formscanner {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the id");
		int id = sc.nextInt();
		System.out.println("Enter the name");
		String name = sc.next();
		System.out.println("Enter the company");
		String company = sc.next();
		System.out.println("Enter the designation");
		String designation = sc.next();

		System.out.println("id : " + id);
		System.out.println("name : " + name);
		System.out.println("company : " + company);
		System.out.println("designation : " + designation);
	}
}
