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
		
		int sol1 = X < Y ? (C * 2 * X) + B * (Y - X) : (C * 2 * Y) + A * (X - Y);
		int sol2 = (A * X) + (B * Y);
		
		System.out.println(sol1 < sol2 ? sol1 : sol2);
	}

}