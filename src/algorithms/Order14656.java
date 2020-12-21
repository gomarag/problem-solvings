package algorithms;

import java.util.Scanner;

public class Order14656 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] data = new int[num];

		for (int i = 0; i < data.length; i++) {
			data[i] = scan.nextInt();
		}
		// idx + 1과 같지 않은 원소를 카운팅
		int count = 0;
		for (int i = 0; i < data.length; i++) {
			if (data[i] != (i + 1)) {
				count++;
			}
		}
		System.out.println(count);

	}

}
