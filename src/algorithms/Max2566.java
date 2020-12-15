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
		
		String[] line = new String[81];
		int[] data = new int[81];
		
		for (int i = 0; i < 81; i++) {
			line = sb.toString().split("\\s");
			data[i] = Integer.parseInt(line[i]);
		}
		Arrays.sort(data);
		
		String max = data[80] + "";
		int maxIdx = 0;
		
		for (int i = 0; i < line.length; i++) {
			if (line[i].equals(max)) {
				maxIdx = i;
				break;
			}
		}
		
		System.out.println(max);
		System.out.println((maxIdx / 9 + 1) + " " + (maxIdx % 9 + 1));
	}
}