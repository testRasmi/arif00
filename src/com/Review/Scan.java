 package com.Review;

import java.util.Scanner;

public class Scan{

	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		System.out.println("What year where you born in");
		int yearOfBirth = scan.nextInt();
		scan.nextLine();
		System.out.println("What is your name");
		String name= scan.nextLine();
		int age= 2019-yearOfBirth;
		System.out.println("Your name is "+name+"and your age is  "+age);
		
		
		
		
		/// Write a program that will display person name and age 
		
//		System.out.println("What is your name ?");
//		String name= scan.nextLine();
//		System.out.println("How old are you ? ");
//		int age = scan.nextInt();
//		System.out.println("Okay so your name is "+name +"and your age is  "+age);
//		
		
		// Write a program that will display person fist name, last name and two middle initial
		
//	System.out.println("what is your first name ? ");
//	String firstName =scan.nextLine();
//	System.out.println("what is your last name ? ");
//	String lastName =scan.nextLine();
//	System.out.println("What is your middle name ?");
//	String middleInitial =scan.nextLine();
//	System.out.println("Your first name is "+firstName+" your last is "+lastName+" and your middle initals are "+middleInitial);
	
		
		
//		// Write a program that will display person dream car 
//		// Mine is  Ferrari
		
//		System.out.println("What is your dream car ?");
//		String car= scan.nextLine();
//		System.out.println("Your dream  car is "+car );

}
}