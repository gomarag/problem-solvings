/*
 * 	+------o
 *  |      |
 *  +------+
 */

package algorithms;

import java.util.HashMap;
import java.util.Scanner;

public class Coordinates3009 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for(int i = 0; i < 6; i++) {
			map.put(i, scan.nextInt());
		}
		
		for (int idx = 0; idx < map.size(); idx++) {
			int[] coordX = map.get(idx % 2 !== 0);
			int[] coordY = map.get(idx % 2 != 0);
		}
	}

}
