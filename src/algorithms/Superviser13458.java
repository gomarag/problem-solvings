package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Superviser13458 {

	public static void main(String[] args) throws IOException {
/*		N 5
		A 10 9 10 9 10
		B:7 C:2
*/
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(buffer.readLine());
		
		int[] examinee = new int[N];
		String[] nums = buffer.readLine().split("\\s");

		int[] supervisable = new int[2];
		String[] data = buffer.readLine().split("\\s");
		supervisable[0] = Integer.parseInt(data[0]);
		supervisable[1] = Integer.parseInt(data[1]);
		
		for (int i = 0; i < N; i++) {
			//각 고사장 인원 - 총 감독의 관리 가능 인원
			examinee[i] = Integer.parseInt(nums[i]) - supervisable[0];
		}
		//부감독이 필요없는 경우는 프로그램 종료
		while (true) {
			if (examinee[i] == 0) {
				
			}
		}
	}
}
