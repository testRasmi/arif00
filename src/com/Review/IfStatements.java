package com.Review;

import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
//		  
		//if statement 
		
		//Write a program where int x is greater than int y.
		//Print out "x is greater than y".
		
       //int x = 20;
      //int y = 18;
      //if (x > y) {
      //  System.out.println("x is greater than y");
    //}

		//Write a program to find if a number is even
		//Print out variable + "a even number"
		//DON'T use else statement your int variable must be even
		
//	int even= 6;
//	if(even%2==0) {
//		System.out.println(even+" is a even number");
//	}
		

/// If else Statement 
		
		//Write a program to find if a number is even or odd 
	   //Print out  "My number must be even" or "My number must be odd" 
		// Must use if else 

		
//	int a = 2;
//	if(a%2==0) {
//		System.out.println( "My number must be even");
//	} else {
//		System.out.println( "My number must be odd");
//	}
	
		//Write a program to find if a number is positive or neutral or negative 
		   //Print out variable + "My number must be even" or "My number must be odd" 
			// Must use if then a else if and lastly else 
		
//	int a= -3;
//	if(a>=0) {
//		System.out.println("My number is a positive number ");
//	}
//	else if (a==0) {
//		System.out.println("My number is a  neutral number ");
//	}
//	else {
//		System.out.println("My number is a negative number");
//	}
		
		   //Write a program to find if the variable time is either morning or the afternoon or the evening using military time
		   //Print out  ""Good morning."" or "Good day."  or Good evening
			// Must use if then a else if and lastly else 

		
//		int time = 22;
//		if (time < 10) {
//		  System.out.println("Good morning.");
//		} else if (time < 13) {
//		  System.out.println("Good day.");
//		} else {
//		  System.out.println("Good evening.");
//		}
//		
//		
		


		//Write a program to find if the largest Number of three numbers
		   //Print out  System.out.println("Largest number is " + largestNumber);
			// Must use if then a else if and lastly else 


//
//
//		        Double n1 = -1.0, n2 = 4.5, n3 = -5.3, largestNumber;
//
//		        if (n1 >= n2) {
//
//		            if (n1 >= n3) {
//
//		                largestNumber = n1;
//
//		            } else {
//
//		                largestNumber = n3;
//
//		            }
//
//		        } else {
//
//		            if (n2 >= n3) {
//
//		                largestNumber = n2;
//
//		            } else {
//
//		                largestNumber = n3;
//
//		            }
//
//		        }
//
//
//
//		        System.out.println("Largest number is " + largestNumber);
//
//		    }

		//Write a program to find out a person name, age and salary
		   //Print out   System.out.println("Name: " + name); ,  System.out.println("Age: " + age); ,   System.out.println("Salary: " + salary); 
//
			// Must use the scanner class
//
//		    Scanner myObj = new Scanner(System.in);
//
//		    System.out.println("Enter name");
//
//		    String name = myObj.nextLine();
//
//	       System.out.println("Enter age");
//		
//		    int age = myObj.nextInt();
//
//          System.out.println("Enter salary");
//		
//		    double salary = myObj.nextDouble();
//
//		    System.out.println("Name: " + name); 
//
//		    System.out.println("Age: " + age); 
//
//		    System.out.println("Salary: " + salary); 
//
//		  }
//
//		}
//
//
//
//
		//Write a program to find out a person name, gender, age,mobile number
		   //Print out   System.out.println("Name: "+name);  ,   System.out.println("Gender: "+gender); ,    System.out.println("Age: "+age); , System.out.println("Mobile Number: "+mobileNo); 
			// Must use the scanner class
//
//		        Scanner sc = new Scanner(System.in); 
//
//		        String name = sc.nextLine();
//
//		        char gender = sc.next().charAt(0); 
//
//		        int age = sc.nextInt(); 
//
//		        long mobileNumber = sc.nextLong(); 
//
//		        System.out.println("Name: "+name); 
//
//		        System.out.println("Gender: "+gender); 
//
//		        System.out.println("Age: "+age); 
//
//		        System.out.println("Mobile Number: "+mobileNo); 

		
		//Write a program with two boolean values summer and sunny
		//As a family  we go on  vacation ONLY when it's the summer time. Once we're on vacation we like to go the beach ONLY when it's sunny outside.

		
//	boolean summer= true;
//	boolean sunny= true;
//	if(summer==true) {
//		System.out.println("It's the summer so.....");
//		if(sunny==true) {
//			System.out.println("We're going to the beach");
//		}
//		else {
//			System.out.println("We're not going to the beach");	
//		}
//		
//	}else {
//		System.out.println("It's not the summer");
//	}
		
		
		//Write a program with one int value for salary and four String values for different cars
		//If you make over 50000 a year, you may buy a brand new car otherwise you should buy a use car. For those you can afford a new car there are different price ranges
		//I want anything under 70k to be Audi A5
		//I want anything under 80k to be Mercedes-Benz
		//I want anything under 90k to be Jaguar
		//I want anything under 100k to be Tesla
		// And if you make less than 60k output to read "Save up money and wait until next year"
		
		
//		int salary = 65000;
//		String a="Audi A5";
//	    String b="Mercedes-Benz";
//		String c="Jaguar";
//		String d="Tesla";
//		
//	if(salary>50000) {
//			if(salary>=60000) {
//				System.out.println("With this salary you afford "+a);
//			}
//			else if (salary>=70000) {
//				System.out.println("With this salary you afford "+b);
//			}
//	        else if (salary>=80000) {
//	        	System.out.println("With this salary you afford "+c);
//	        } 
//	        else if (salary>=90000) {
//	        	System.out.println("With this salary you afford "+d);
//	        }
//	        else {
//	        	System.out.println("Save up money and wait until next year");
//	        }
//	} else  {
//	 	System.out.println("Sorry unfortunately you might want to buy a use car instead");
//	}
	
	}
}