/*
 * 제곱근이 존재하는지 확인하고 존재한다면 그 제곱근을 반환.
 * 무리수일 경우에는 0을 반환함.
 * 
 * 예)Sqrt.sqrt(4) == 2;
 *   Sqrt.sqrt(9) == 3;
 * 	
 * 따라서 sqrt(nb)가 정수가 되려면 nb == i * i의 형태여야 한다.
 * nb를 i = 2부터 차례로 나누어 보면서 몫이 i, 나머지가 0인 nb만 제곱근을 반환한다.
 */
package basics;
/*
 *  @version	1.10 12 Dec 2020
 *  @author		Garam Ann
 */
public class Sqrt {
	public int sqrt(int number) {
		int result = 0;
		/* 음수일 경우 */
		if (number < 0) {
			return 0;
		}

		/* 0, 1일 경우 */
		if (number <= 1) {
			return number;
		} 
		
		/* number가 2인 경우 부터 확인*/
		for (int i = 1; i < (number / i); i++) {
			if (i * i == number) {
				result = i;
			} else {
				result = 0;
			}
		}
		return result;
	}
	public static void main(String[] args) {
		Sqrt test = new Sqrt();
		System.out.println(test.sqrt(4));
	}
}
