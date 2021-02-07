package algorithms;

import java.util.Scanner;

public class Chickens16917 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int s = scan.nextInt();
		int f = scan.nextInt();
		int hh = scan.nextInt();
		
		int s_many = scan.nextInt();
		int f_many = scan.nextInt();
		
		int sol = 0;
		int remained_half, remained_each = 0;
		// 1. 각각 사는 게 반반보다 쌀 때
		if (s + f <= hh * 2) {
			sol = s * s_many + f * f_many;
		// 2. 반반이 더 쌀 때: 최대한 반반을 많이 사도록
		} else {
			sol = hh * 2 * Math.min(s_many, f_many);
			//남은 마리: 반반
			remained_half = (s_many > f_many ? s_many - f_many : f_many - s_many) * hh * 2;
			remained_each = s_many > f_many ? (s_many - f_many) * s : (f_many - s_many) * f;
			
			sol += Math.min(remained_half, remained_each);
		}
		System.out.println(sol);
	}

}