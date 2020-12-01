package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SmallerThan1087 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] N_X = br.readLine().trim().split("\\s"); //N_X
		String[] elems = br.readLine().trim().split("\\s");	//array_A
		
		int[] data = new int[Integer.parseInt(N_X[0])];
		int pivot = Integer.parseInt(N_X[1]);
		
		for (int i = 0; i < data.length; i++) {
			data[i] = Integer.parseInt(elems[i]);
		}
		
		for (int i = 0; i < data.length; i++) {
			if (data[i] < pivot) {
				bw.write(data[i] + "\s");
			}
		}
		br.close();
		bw.close();
	}

}
