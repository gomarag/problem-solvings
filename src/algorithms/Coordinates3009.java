/*
 * 	+------o
 *  |      |
 *  +------+
 *  
 *  배타적 논리합 XOR^
 *  System.out.println(30^20);							//10
	System.out.println((30^20)^20);						//30
	System.out.println(Integer.toBinaryString(30));		//11110
	System.out.println(Integer.toBinaryString(20));		//10100
	System.out.println(Integer.toBinaryString(10));		// 1010
 */

package algorithms;

import java.util.Scanner;

public class Coordinates3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = 0, y = 0;
		
		for (int i = 0; i < 3; i++) {
			x ^= scan.nextInt();
			y ^= scan.nextInt();
		}
		System.out.print(x + " " + y);
	}
}
