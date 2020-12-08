package algorithms;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PeopleInTrain2455 {

	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int[] station = new int[4];
		int people = 0;
		
		for (int i = 0; i < 4; i++) {
			people -= scan.nextInt();
			people += scan.nextInt();
			station[i] = people;
		}
		
		Arrays.sort(station);
//		for (int el: station) {
//			System.out.println(el);
//		}
		System.out.println(station[station.length - 1]);
	}
}
