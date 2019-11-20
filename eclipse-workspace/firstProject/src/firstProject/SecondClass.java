package firstProject;

import java.util.Scanner;

public class SecondClass{
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.print("Enter number");
		
		if (userInput.hasNextInt()) {
			System.out.println("You entered a number");
			int num = userInput.nextInt();
			System.out.println(num);
		}else {
			System.out.println("enter a number moron");
		}
		
		int randomNumber = (int)(Math.random()*101);
				System.out.println(randomNumber);
	}
}
