package algorithms;

import java.util.Scanner;

public class ReTriangleAlignedCenter {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for (int row = 0; row < count; row++) {
			for (int blk = 0; blk < row ; blk++) {
				System.out.print(" ");
			}
			for (int star = 0; star < 2 * (count - row) - 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
