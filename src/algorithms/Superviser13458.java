package algorithms;

import java.util.Scanner;

public class Superviser13458 {

	public static void main(String[] args) {
/*		N 5
		A 10 9 10 9 10
		F:7 S:2
		
		1) first 만으로 충분한 경우
			An - F <= 0
		2) first + second 까지 필요한 경우
			first = N
			second = 올림(An / second)
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
		
		int superviser = 0; double vice = 0;
		
		for (int i = 0; i < examinee.length; i++) {
			if (examinee[i] <= firstCoverage) {
				superviser++;
			} else {
				superviser++;
				vice += Math.ceil((examinee[i] - firstCoverage) / secondCoverage);
			}
		}
		System.out.println(superviser + (int)vice);
	}
}
