package firstProject;

public class FirstProject {

	static String randomString = "String to print out";
	static final double PI = 3.14159;

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(PI);

		int integer1 = 22;
		int integer2 = integer1 + 1;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		String intToString = Integer.toString(integer1);
		
		//Casting
		
		int doubleToInt = (int)PI;
		
		System.out.println(doubleToInt);
		String numbers = "158328";
		int parsedNumber = Integer.parseInt(numbers);
		System.out.println(parsedNumber);
	}
}