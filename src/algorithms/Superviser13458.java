package algorithms;

import java.util.Scanner;

public class Superviser13458 {

	public static void main(String[] args) {
/*		N 5
		A 10 9 10 9 10
		F:7 S:2
		
		1) first 만으로 충분한 경우
			수험생 수 - 총 감독 감시 가능 인원 <= 0
		2) first + second 까지 필요한 경우
			총 감독 수 = 고사장 수
			부 감독 수 = 올림((수험생 수 - 총 감독 감시 가능 인원)/ 부 감독 감시 인원)
*/
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		long[] examinee = new long[N];
		//고사장 별 수험생 인원 입력
		for (int i = 0; i < N; i++) {
			examinee[i] = scan.nextLong();
		}
		
		long firstCoverage = scan.nextLong();
		double secondCoverage = scan.nextDouble();
		
		long superviser = 0; double vice = 0;
		
		for (int i = 0; i < examinee.length; i++) {
			//총 감독만으로 감시 가능함: 어쨌든 고사장마다 총 감독은 1명이 필요
			if (examinee[i] <= firstCoverage) {
				superviser++;
			//총 감독 외에 부감독이 필요함: examinee[i] > firstCoverage 
			} else {
				superviser++;
				vice += Math.ceil((examinee[i] - firstCoverage) / secondCoverage);
			}
		}
		System.out.println(superviser + (long)vice);
	}
}
