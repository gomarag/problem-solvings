package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HotelRoom10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(buffer.readLine()); //2
		
/*		2
		6 12 10
		30 50 72
*/
		String[][] testCase = new String[T][3];
		
		for (int i = 0; i < T; i++) {
			testCase[i] = buffer.readLine().split("\\s"); //6, 12, 10 | 30, 50, 72
		}
	}
}
