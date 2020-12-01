package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SmallerThan10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String[] N_X = br.readLine().trim().split("\\s"); //N_X
		String[] data = br.readLine().trim().split("\\s");	//array_A
		
		for (int i = 0; i < data.length; i++) {
			if (Integer.parseInt(data[i]) < Integer.parseInt(N_X[1])) {
				bw.write(data[i] + " ");
			}
		}
		br.close();
		bw.close();
		
//      **System.out.println("10".compareTo("5"));	//-4
//		System.out.println("b".compareTo("a"));		//1
	}
}
