package firstProject;

import java.util.Scanner;

public class LessonFive {
	
	static double rand; // class variable
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println(getRandomNum());
		
		int guessResult = 1;
		int randomGuess = 0;
		while(guessResult!=-1) {
			System.out.println("Guess:");{
				checkGuess(in.nextInt());
			}
		}
	}
	
	public static int getRandomNum() {
		return (int) (Math.random()*51);
	}
	
	public static int checkGuess(int guess) {
		if(guess==rand) {
			return -1;
		}else {
			return guess;
		}
	}
}
