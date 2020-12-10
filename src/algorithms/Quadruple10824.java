package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quadruple10824 {
/*
	입력될 수의 최댓값이 1,000,000이기 때문에 long으로 받을 것
	10_20_30_40으로 들어왔을 때 4개의 토큰 말고, 10_20 | 30_40으로 나눌 수 없을까?
*/
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String[] line = buffer.readLine().split("\\s");
		buffer.close();
		
		StringBuilder sb1 = new StringBuilder();
		StringBuilder sb2 = new StringBuilder();
		
		long num1 = Long.parseLong(sb1.append(line[0]).append(line[1]).toString());
		long num2 = Long.parseLong(sb2.append(line[2]).append(line[3]).toString());
		
		System.out.println(num1 + num2);
	}
}
