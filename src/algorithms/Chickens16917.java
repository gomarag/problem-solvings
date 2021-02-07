package algorithms;

import java.util.Scanner;

public class Chickens16917 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int A = scan.nextInt();
		int B = scan.nextInt();
		int C = scan.nextInt();
		
		int X = scan.nextInt();
		int Y = scan.nextInt();
		
		//각각 수량을 구입
		
		//반반으로 최대 수량을 맞추기: 수량은 최소야
		int sol = 0;
		if (A + B <= C * 2) {
			sol = (X * A) + (Y * B);
		} else {
			if (X < Y ) {
				sol = X * 2 * C + (Y - X) * B;
			} else {
				sol = Y * 2 * C + (X - Y) * A;
			}
		}
		
		System.out.println(sol);
	}

}