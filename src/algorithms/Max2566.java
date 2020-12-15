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
		//문자열이 있음: line
		//"1 2 3 4 5"에서 3의 인덱스
		int[] data = new int[81];
		String[] line = new String[8];
		for (int i = 0; i < 81; i++) {
			line = sb.toString().split("\\s");
			data[i] = Integer.parseInt(line[i]);
		}
		Arrays.sort(data);
		System.out.println("Max: " + data[80]);
		
		String max = data[80] + "";
		System.out.println("maxStr: " + max);
		int maxIdx = 0;
		for (int i = 0; i < line.length; i++) {
			if (line[i] == max) {
				maxIdx = i;
				return;
			}
		}
		
		System.out.println("maxIdx: " + maxIdx);
	}
}