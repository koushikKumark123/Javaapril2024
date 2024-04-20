package com.javatraining.condition;

import java.util.Scanner;

public class SrudentForm {
	public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for personal information
	        System.out.println("Enter your full name:");
	        String fullName = scanner.nextLine();

	        System.out.println("Enter your date of birth:");
	        String dob = scanner.nextLine();

	        System.out.println("Enter your gender:");
	String gender = scanner.nextLine();


	        System.out.println("Enter your phone number:");
	        int phone = scanner.nextInt();

	        System.out.println("Enter your GPA/grades:");
	        String gpa = scanner.nextLine();


	        // Display the collected information
	        System.out.println("\n\nStudent Information:");
	        System.out.println("Full Name: " + fullName);
	        System.out.println("Date of Birth: " + dob);
	        System.out.println("Gender: " + gender);
	        System.out.println(phone + phone);
	        
	        System.out.println("GPA/Grades: " + gpa);

	        // Close the scanner
	        scanner.close();
	    }
	}
	  
