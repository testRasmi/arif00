package ClassOne;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int chances=10;
		String leapYear;
		
		
		System.out.println("Please enter a year");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
			for (int j = 1; j <= 10; j++) {
				
				if(year%4 == 0) {
					System.out.println(" Yes, it is a leap year!");
					break;
				}else if (j < 7) {
					System.out.println(" Please enter a leap year");
				}else if (j == 7) {
					System.out.println("You only have three more chances left");
					System.out.println(" Please enter a leap year");
					
				}else {
					System.out.println("Sorry NOT a leap year");
				}
				year = scan.nextInt();
			}
			
//			boolean notLeap = true;
//			while(notLeap) {
//				
//				notLeap = false;
//				
//			}
//			for(int i=0;i<chances;i++) {
//				if(i==7) {
//				System.out.println("you only have three more chances");
//				}
//				
				
		
//			if(year % 4 == 0) {
//				leapYear="It's a leap year";
//				
//		        }
//		        else if (year % 100 == 0)
//		        {
//		        	leapYear="It's not a leap year";
//		        
//		        }
//		        else if(year % 4 == 0)
//		        {
//		        	leapYear="It's a leap year";
//		       
//		        }
//		        else
//		        {
//		        	leapYear="It's not a leap year";
//			}
//	             System.out.println(leapYear);
//		
//			
//		}
		
		
		
		
	}

}
