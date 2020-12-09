package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class HotelRoom10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(buffer.readLine().trim()); //2
		String[][] testcase = new String[T][3];
		
		for (int i = 0; i < T; i++) {
			for (int j = 0; j < 3; j++) {
				testcase[i] = buffer.readLine().split("\\s"); //testcase[0] = 6, 12, 10
			}
		}
		System.out.println(testcase[0][1]);
	}
}
