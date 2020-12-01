package algorithms;

import java.util.Scanner;

public class AlignedCenter2442 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		
		for (int row = 0; row < count; row++) {
			for (int blk = 0; blk < count - (row + 1) ; blk++) {
				System.out.print(" ");
			}
			for (int star = 0; star < (row * 2) + 1; star++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
