package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Max2566 {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 9; i++) {
			sb.append(buffer.readLine());
			sb.append(" ");
		}
		buffer.close();
		
		String[] token = new String[81];
		int[] data = new int[81];
		for (int i = 0; i <81; i++) {
			token = sb.toString().split("\\s");
			data[i] = Integer.parseInt(token[i]);
		}
		Arrays.sort(data);
		System.out.println(data[80]);
	}
}
