/*
 * 완전탐색을 사용할 생각.
 * 약수를 하나씩 구해가면서 약수를 찾을 때마다 k를 차감해간다.
 * k = 0이 되면 그 순간의 약수를 반환.
 * 단, 약수가 자연수 N만큼 커졌는데도 k가 여전히 양수라면 약수 개수가 k보다 작은 것이므로 0 반환.
 * 
 * */

package algorithms;

import java.util.Scanner;

public class Divisor2501 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		int k = scan.nextInt();
		
		for (int divisor = 1; divisor <= N; divisor++) {
			if (N % divisor == 0) {
				k--;
				if (k == 0) {
					System.out.println(divisor);
					return;
				}
			}
		}
		System.out.println(0);
	}
}
