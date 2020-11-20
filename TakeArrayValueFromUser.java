import java.util.Scanner;

public class TakeArrayValueFromUser {
//Requirement : Create program that take 5 numbers from User save them in Array and print total of them. 
		public static void main(String[] args) {
			
			System.out.println("Hello customer..Please follow the below steps :");
			Scanner userInput = new Scanner(System.in);  // creating scanner object to get from user the Array values
				
	//then Create Array, its name "arrayElements" with Data type int
			int [] arrayElements=new int [5]; //[Array initializing & contraction in the same line ] 
			
	//Then asking User to enter the elements value :
			System.out.println("\nEnter the 1st element's value:");
			arrayElements[0] =userInput.nextInt();
			
			System.out.println("Enter the 2nd element's value:");
			arrayElements[1] =userInput.nextInt();
			
			System.out.println("Enter the 3rd element's value:");
			arrayElements[2] =userInput.nextInt();
			
			System.out.println("Enter the 4th element's value:");
			arrayElements[3] =userInput.nextInt();
			
			System.out.println("Enter the 5th element's value:");
			arrayElements[4] =userInput.nextInt();
						
	//then print the elements values 
			
			System.out.println("\nThe 1st element value: "+arrayElements[0]+"\nThe 2nd element value: "+arrayElements[1]+"\nThe 3rd element value: "+arrayElements[2]
					           +"\nThe 4th element value: "+arrayElements[3]+"\nThe 5th element value: "+arrayElements[4] );
			
	//then sum these elements values & print them	
			int addition = arrayElements[0]+arrayElements[1]+arrayElements[2]+arrayElements[3]+arrayElements[4];
			
			System.out.println("\nAnd they Total is = "+addition);
		}
		
	}
