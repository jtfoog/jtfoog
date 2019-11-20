import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

	/*
	 * Complete the 'winner' function below.
	 *
	 * The function is expected to return a STRING. The function accepts following
	 * parameters: 1. STRING erica 2. STRING bob
	 */

	public static String winner(String erica, String bob) {
		String winner = null;
		int totalErica = 0;
		int totalBob = 0;
		
		for (int i = 0; i < erica.length(); i++) {
			if (erica.charAt(i) == 'E') {
				totalErica = totalErica + 1;
			}
			if (erica.charAt(i) == 'M') {
				totalErica = totalErica + 3;
			}
			if (erica.charAt(i) == 'H') {
				totalErica = totalErica + 5;
			}
		}
		
		for (int i = 0; i < bob.length(); i++) {
			if (bob.charAt(i) == 'E') {
				totalBob = totalBob + 1;
			}
			if (bob.charAt(i) == 'M') {
				totalBob = totalBob + 3;
			}
			if (bob.charAt(i) == 'H') {
				totalBob = totalBob + 5;
			}
		}
		if(totalErica > totalBob) {
			winner = "Erica";
		}else if(totalErica < totalBob) {
			winner = "Bob";
		}else {
			winner = "Tie";
		}
		return winner;

	}

}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String erica = bufferedReader.readLine();

		String bob = bufferedReader.readLine();

		String result = Result.winner(erica, bob);

		bufferedWriter.write(result);
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}