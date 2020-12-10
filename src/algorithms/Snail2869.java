package algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Snail2869 {
/*	
	달팽이가 하루에 전진할 수 있는 높이 계산, 매일 전진하면서 남은 높이를 갱신하도록.
	
	in: remain, progress, day
	out: day
	
	정상 도착 후에는 미끄러지지 않는다 >>> (남은 거리 <= 올라갈 거리)가 되는 최초의 순간에 break
	갱신된 남은 거리 remain = remain - (progress * day)
	
	따라서 이를 수식으로 표현하면 remain - (progress * day) <= day
	day에 관해서 정리하면 (remain - up) / progress 가 되고
	소수점도 살려서 계산해야 하기 때문에 Math.ceil과 double을 사용해서 정확하게 계산하도록 조정.
*/
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		String[] line = buffer.readLine().split("\\s");
		buffer.close();
		
		int up = Integer.parseInt(line[0]);
		int progress = Integer.parseInt(line[0]) - Integer.parseInt(line[1]);
		double remain = Double.parseDouble(line[2]);
		
		double day = Math.ceil((remain - up) / progress) + 1;
		
		System.out.println((int)day);
	}
}
