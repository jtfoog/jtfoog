package firstProject;

import java.util.*;
import java.io.*;

public class LessonSix {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) {

		try {
			throwMethod(); //this method prints an int back to user
		}catch (InputMismatchException e){
			System.out.println("Input Mismatch Exception");//NOT AN INT
			in.next();
		}finally {
			nonThrowMethod();
		}

	}
	
	public static void throwMethod() throws InputMismatchException{
		System.out.println(in.nextInt()); //will throw exception if input is not an int
	}
	
	public static void nonThrowMethod() {
		try {
			System.out.println(in.nextFloat());
		}catch (InputMismatchException e) {
			System.out.println("Input Mismatch Exception");
		}catch(Exception i) {
			i.printStackTrace();
			System.out.println("General exception occurred");
		}
	}
}