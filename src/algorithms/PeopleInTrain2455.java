package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PeopleInTrain2455 {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int[] station = new int[8];
		int i = 0;
		
		while ((line = buffer.readLine()) != null) {
			StringTokenizer token = new StringTokenizer(line);	//0 32
			station[i++] = Integer.parseInt(token.nextToken());
			System.out.println(station[i]);
		}
	}

}
