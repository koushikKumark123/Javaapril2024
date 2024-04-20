package com.javatraining.condition;

import java.util.Scanner;

public class SwitchEX {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the week day");
		String s = sc.next();
		switch(s) {
		case "sunday":
			System.out.println("today is sunday");
			break;
		case "Monday":
			System.out.println("today is Monday");
			break;
		case "tuesday":
			System.out.println("today is tuesday");
			break;
		case "wednesday":
			break;
		case "thursday":
			System.out.println("today is thursday");
			break;
		case "Friday":
			System.out.println("today is Friday");
			break;
		case "Saturday":
			System.out.println("today is sunday");
			break;
			default:
				System.out.println("this is not week day");
		}
	}
}

