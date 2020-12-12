/*
 * - 약수를 모두 구한 후에 0번 인덱스부터 카운팅 해가는 방법
 * - 약수 구하지 않고 제곱수/안제곱수 확인하고 '약수의 개수'만 구할 것
 * 
 * 약수의 개수?
 * 1) 제곱수면 제곱근 기준으로 대칭: 홀수
 * 2) 안제곱수면 대칭: 짝수
 * 
 * 제곱수임을 확인하려면? 
 * */

package algorithms;

import java.util.Scanner;

public class Divisor2501 {
	static boolean isSquareNum(int nb) {
		if (nb <= 0) {
			return false;
		}
		
		int i = 1;
		while (i < (nb / i)) {
			i++;
		}
		boolean result = Math.sqrt(nb) == i ? true : false;
		return result;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int p = scan.nextInt();
		int q = scan.nextInt();
		
		int divisor = 0;
		int N = 2;
		
		while (true) {
			if (p % N == 0) {	/* 나눠 떨어지면 약수 */
				divisor++;
			} else {			/* 안 나눠 떨어지면 다음으로 */
				N++;
			}
		}
		
//		System.out.println(isSquareNum(256));
	}

}
