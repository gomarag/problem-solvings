package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HotelRoom10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(buffer.readLine());
		System.out.println("T:" + T);
		String[] data = new String[3];
		
		//testCase 읽어들이기
		for (int i = 0; i < T; i++) {
			data = buffer.readLine().trim().split("\\s");
		}
		System.out.println("len:"+ data.length);
		for (String str: data) {
			System.out.println(str);
		}
		
//		//각 testCase에서 H, W, N 추출 후 할당
//		int H = 0; int W = 0; int N = 0;
//		
//		for (int i = 0; i < testCase.length; i++) {
//			H = testCase[i].charAt(0);
//			W = testCase[i].charAt(1);
//			N = testCase[i].charAt(2);
//			
//		}
//		
//		StringBuilder sb = new StringBuilder();
//		String roomNumber;
//		
//		if (N % H == 0) {
//			roomNumber = sb.append(H).append(0).append(N / H).toString();
//		} else {
//			roomNumber = sb.append(N % H).append(0).append(N / H + 1).toString();
//		}
//		System.out.println(roomNumber);
	}

}
