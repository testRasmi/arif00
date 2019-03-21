package ClassTwo;

import java.util.Scanner;

public class array {

	public static void main(String[] args) {
////		Create an array of chars and store grades into it: A,B,C,D,E,F. Then print a grade B (use 2 different ways of creating an array).
//		char [] grades = { 'A','B','C','D','E','F'};
//		System.out.println(grades[1]);
//		char [] gradesTwo= new char[6];
//		gradesTwo[0]='A';
//		gradesTwo[1]='B';
//		gradesTwo[2]='C';
//		gradesTwo[3]='D';
//		gradesTwo[4]='E';
//		gradesTwo[5]='F';
//		System.out.println(gradesTwo[1]);
//		
//		
//		
//
//		
//		
//
//	//	Create an array of names and store all names of your group. Then print your name from that array. (use 2 different ways of creating an array).
//		
//		String [] names= {"bob","tom","joe"};
//		System.out.println(names[2]);
//		
//		String [] namesTwo= new String [3];
//		
//		 namesTwo[0]="bob";
//		 namesTwo[1]="tom";
//		 namesTwo[2]="joe";
//		System.out.println( namesTwo[0]);
//		
//		
//		
//		
//		
//		
//		
//		
//		
//
////		Create an array of words: Java, Saturday, day, coding, is. Print the following sentence using element of array: “Saturday is Java coding Day”. 
//		
//		String [] words= {"Java", "Saturday", "day", "coding", "is"};
//		System.out.println(words[1]+" "+words[4]+" "+words[0]+" "+words[3]+" "+words[2]+".");
//		
//		
//			int[][] numbers = { 
//					{ 12, 13, 14, 15, 16 }, 
//					{ 21, 22, 23, 24, 25 }, 
//					{ 31, 32, 33, 34, 35 } 
//			};
//
//			for (int row = 0; row < numbers.length; row++) {
//				for (int col = 0; col < numbers[row].length; col++) {
//					System.out.print(numbers[row][col]+" ");		
//				}
//
//		
//			}
//			
//			
//			
//		
		
		
	
//	int a=10;
//	a=a+1;
//	System.out.println(a);
//	int b=10;
//	b+=1;
//	System.out.println(b);
//	int c=10;
//	++c;
//	System.out.println(c);	

//		for(int i=0;i<7;i++) {
//			System.out.println(i);
//		}
//	}
//
//		int m=2, total=0;
//
//		while(m<6) {
//
//		  total=total+m;
//
//		  m++;
//
//		}
//
//		System.out.print(total);
		
		
		
		
//	}
		
	Scanner scan = new Scanner(System.in);
	String [] array = {"Sunday","Monday","Tuseday","Wednesday","Thursday","Friday","Saturday"};
	for(int i=0;i<=array.length;i++) {
		System.out.println("Please enter a number");
		int day = scan.nextInt();
		if(day==1) {
			System.out.println(array[0]);
			break;
		}
		else if(day==2) {
			System.out.println(array[1]);
			break;
		}
		else if(day==3) {
			System.out.println(array[2]);	
			break;
		}
		else if(day==4) {
			System.out.println(array[3]);	
			break;
		}
		else if(day==5) {
			System.out.println(array[4]);
			break;
		}
		else if(day==6) {
			System.out.println(array[5]);
			break;
		}
		
		else if(day==7) {
			System.out.println(array[6]);
			break;
		}
	}
	
	}
}
