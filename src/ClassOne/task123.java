package ClassOne;

import java.util.Scanner;

public class task123 {

	public static void main(String[] args) {
	
//		for(int i=1;i<20;i+=2) {
//			System.out.println(i);
//		}
		
//		Scanner scan = new Scanner(System.in);
//		int year;
//		int counter=10;
//		while(counter>=10) {
//			System.out.println("Give me a year");
//			year=scan.nextInt();
//			if(year%4==0) {
//				System.out.println("it's a leap year");
//				break;
//			}
//			else if (year%100==0) {
//				System.out.println("it's not a leap year");
//				System.out.println("pick another year");
//				
//			}
//			else if (year%400==0) {
//				System.out.println("it's not a leap year");
//				break;
//			}
//			else {
//				System.out.println("it's not a leap year");
//				System.out.println("pick another year");
//			}
//		
//		}
//		counter++;
//		
		
		Scanner scan = new Scanner (System.in);
		int mySecretNumber =18;
		int number;
		int counter=0;
		while(counter==counter) {
			System.out.println("Enter a number between 1 and 20");
			number=scan.nextInt();
			if(number>=1 && number <=20) {
			
			if(mySecretNumber>number) {
				System.out.println("your number is smaller than my number");
				
			}
			else if(mySecretNumber<number) {
				System.out.println("your number is bigger than my number");
			}
			else if(mySecretNumber==number) {
				System.out.println("you got my number");
				break;
			}
			
			}
			else {
				System.out.println(" this number is out");
			}
			counter ++;
		}
		
	}

}
