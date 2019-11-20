package firstProject;

public class LessonFour{
	public static void main(String[] args) {
		
	
		double myPI = 4.0;
		
		double j = 3.0;
	
		while(j < 100) {
			myPI = myPI - (4/j) + (4/(j+2));
			j+=4;
			System.out.println(myPI);
		}
		
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}as