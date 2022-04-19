package tokkic.calendar;

import java.util.Scanner;

public class Calendar {
	public static void main(String[] args) {

		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		// 반복횟수 입력

		System.out.println("반복횟수를 입력하세요.");

		Scanner scan = new Scanner(System.in);
		int month_retry_num = scan.nextInt();

		System.out.println("월을 입력하세요.");

		// 입력된 반복 횟수 만큼 입력하여 배열에 저장

		int[] month_data = new int[month_retry_num];
		
		for (int month_retry = 0; month_retry < month_retry_num; month_retry++) {

			month_data[month_retry] = scan.nextInt();
			
		}

		// 배열의 데이터 값을 꺼내어 출력하기

		byte month_day[] = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		
		for (int i = 0; i < month_data.length; i++) {
			
			int m1 = month_data[i];
			int m2 = month_day[m1 - 1];
			
			System.out.printf("%d월은 %d일까지 있습니다.", m1, m2);
			
		}
		scan.close();
	}
}
