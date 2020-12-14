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
		//"1 2 3 4 5"에서 3의 인덱스를 알고 싶음
		String[] line = new String[81];
		int[] data = new int[81];
		for (int i = 0; i < 81; i++) {
			line = sb.toString().split("\\s");
			data[i] = Integer.parseInt(line[i]);
		}
		Arrays.sort(data);
		System.out.println(data[80]);
		
		char ch = (char) data[80];
		System.out.println(ch);
		System.out.println((int)ch);
		System.out.println(sb.toString().indexOf((int)ch));
	}
}