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
		int[] divisor = new int[p / 2 + 1];
		
		int count = 0;	/* 제곱근까지의 약수 갯수*/
		int i = 1;
		int idx = 0;
		while (i < Math.sqrt(p)) {
			if (p % i == 0) {
				divisor[idx++] = i;
				count++;
				i++;
			} else i++;
		}
		/* 전체 약수 개수 == divisor.len */
		if (isSquareNum(p)) {
			count = count * 2 + 1;
			divisor[idx] = (int) Math.sqrt(p);
			for (int o = idx + 1; o < count; o++) {
				divisor[o] = p / divisor[count - o - 1];
			}
		} else {
			count *= 2;
			for (int o = idx; o < count; o++) {
				divisor[o] = p /divisor[count - o - 1];
			}
		}
		
		if (q > count) {
			System.out.println(0);
		}
		
		System.out.println(divisor[q - 1]);
	}
}
