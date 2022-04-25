package tokkic.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT_Y = "YEAR>";
	private final static String PROMPT_M = "MONTH>";
	private final static String PROMPT_W = "DAY OF WEEK ON 1st DAY>";

	public int parseDay(String w) { // 메소드 선언, String 타입의 w를 가진다
							        // w 값은 추후 입력
		int weekday_num;     // 변수 선언해야 아래에서 변수로 쓸수있다

		switch (w) {         //  메소드에서 입력받은 w의 조건을 case로 판단한다
		case "sun":
			weekday_num = 0;
			break;
		case "mon":
			weekday_num = 1;
			break;
		case "tue":
			weekday_num = 2;
			break;
		case "wen":
			weekday_num = 3;
			break;
		case "thu":
			weekday_num = 4;
			break;
		case "fri":
			weekday_num = 5;
			break;
		case "sat":
			weekday_num = 6;
			break;
		default:              // 그 외의 케이스는 기본값 반환
			weekday_num = 0;
		}
		return weekday_num;   // 메소드 끝나고 변수에 값을 반환
	}

	public void runPrompt() {

		Scanner scan = new Scanner(System.in);
		Calendar cld = new Calendar();

		while (true) {

			System.out.println("해당 년도를 입력하세요.");
			System.out.print(PROMPT_Y);
			int year = scan.nextInt(); // int = 초기값 아무거나; 로 따로 초기화 후
										// year = scan.nextInt(); 로 해도 된다
			System.out.println("해당 월을 입력하세요.");
			System.out.print(PROMPT_M);
			int month = scan.nextInt(); // 위 주석처럼 먼저 선언, 초기화을 해도 된다

			System.out.println("그 달 1일의 요일을 입력하세요(sun, mon, tue, wen, thu, fri, sat)");
			System.out.print(PROMPT_W);
			String weekday = scan.next(); // 문자열이므로 양쪽 항 모두 수정해준다
										  // 메소드에 인자로 넣어줄 변수 선언, 초기화
			parseDay(weekday);            // 입력한 변수를 메소드에 인자로 넣음
			
			if (month <= -1)
				break;

			if (month >= 13)
				continue;

			cld.printCalendar(year, month);
		}
		System.out.println("Have a nice day!");
		scan.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
