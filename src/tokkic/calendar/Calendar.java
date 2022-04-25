package tokkic.calendar;

import java.util.Scanner;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysofMMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public static void main(String[] args) {

		System.out.println("일 월 화 수 목 금 토");
		System.out.println("--------------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 14");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 26 27 28");

		// // 반복횟수 입력 삭제, 입력 시 월 별 최대 일 바로 출력, 입력 무한반복
		// // 배열 안쓰기, break 와 continue 사용하여 조건문 만들기

		Scanner scan = new Scanner(System.in);
		Calendar cld = new Calendar();
		String prompt = "cal> ";

		while(true) {
			
		System.out.println("월을 입력하세요.");

		System.out.print(prompt);
		
		int month = scan.nextInt();
		
		if(month<=-1) {
			break;
		}

		if(month>=13) {
			continue;
		}
		System.out.printf("%d월은 %d일까지 있습니다.\r\n", month, cld.getMaxDaysofMMonth(month));

		}
		System.out.println("Have a nice day!");
		scan.close();
	}
}
