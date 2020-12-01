package algorithms;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class LeapYear2753 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		
//		if (year % 4 != 0) {
//			System.out.println(0);
//		} else if (year % 400 == 0) {
//			System.out.println(1);
//		} else if (year % 100 == 0) {
//			System.out.println(0);
//		} else {
//			System.out.println(1);
//		}
		
//		boolean isLeap = java.time.Year.of(year).isLeap();
		
		boolean isLeapYear = new GregorianCalendar().isLeapYear(year);
		System.out.println(isLeapYear ? 1 : 0);
	}
}
