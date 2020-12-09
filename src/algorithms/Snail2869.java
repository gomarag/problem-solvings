package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail2869 {

	public static void main(String[] args) throws IOException {
//		System.out.println(8/5);
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String[] line = buffer.readLine().split("\\s");
		
		int up = Integer.parseInt(line[0]);
		int down = Integer.parseInt(line[1]);
		int height = Integer.parseInt(line[2]);
		
		if ((height - up) % (up - down) == 0) {
			System.out.println("if");
			System.out.println((height - up) / (up - down) + 1);
		} else {
//			System.out.println(up-down);
//			System.out.println(height);
			System.out.println((int)Math.floor(height / (up - down)) + 1);
		}
	}

}
