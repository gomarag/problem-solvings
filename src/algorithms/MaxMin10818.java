package algorithms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MaxMin10818 {
	
	static class QuickSort {
		private static void quickSort(int[] arr) {
			quickSort(arr, 0, arr.length - 1);
		}

		private static void quickSort(int[] arr, int start, int end) {
			int part = partition(arr, start, end);
			
			//*오른쪽 파티션이 시작점보다 1개 이상 클 때
			if (start < part - 1) {
				//함수 호출 후 정렬 시도: 시작점 ~ 오른쪽 파티션 바로 앞
				quickSort(arr, start, part - 1);
			}
			//오른쪽 파티션의 시작점이 마지막 배열방보다 작을 때
			if (part < end) {
				//오른쪽 파티션 정렬
				quickSort(arr, part, end);
			}
		}

		private static int partition(int[] arr, int start, int end) {
			int pivot = arr[(start + end) / 2];
			
			//포인트 옮기기
			while (start <= end) {
				while (arr[start] < pivot) start++;
				while (arr[end] > pivot) end--;
				if (start <= end) {
					swap (arr, start, end);
					start++;
					end--;
				}
			}
			return start;
		}
		
		public static void swap(int[] arr, int start, int end) {
			int tmp = arr[start];
			arr[start] = arr[end];
			arr[end] = tmp;
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine().trim());
		String[] input = br.readLine().trim().split("\\s");
		
		int[] data = new int[num];
		
		for (int idx = 0; idx < data.length; idx++) {
			data[idx] = Integer.parseInt(input[idx]);
		}
		
		QuickSort.quickSort(data);
		bw.write(data[0] + " " + data[data.length - 1]);
		
		br.close();
		bw.close();
	}
}
