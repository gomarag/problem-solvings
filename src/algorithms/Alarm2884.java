package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Alarm2884 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] time = br.readLine().trim().split("\\s");
		
		int hr = Integer.parseInt(time[0]); 
		int min = Integer.parseInt(time[1]);
		
		if (min >= 45) {
			min -= 45;
			bw.write(hr + " " + min);
		} else {
			hr -= 1;
			min += 15;
			hr = (hr < 0) ? hr += 24 : hr;
			bw.write(hr + " " + min);
		}
		br.close();
		bw.close();
	}

}
