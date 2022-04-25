package tokkic.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT_Y = "YEAR>";
	private final static String PROMPT_M = "MONTH>";

	public void runPrompt() {

		Scanner scan = new Scanner(System.in);
		Calendar cld = new Calendar();

		while (true) {

			System.out.println("해당 년도를 입력하세요.");
			System.out.print(PROMPT_Y);
			int year = scan.nextInt();    // int = 초기값 아무거나; 로 따로 초기화 후
										  // year = scan.nextInt(); 로 해도 된다
			System.out.println("해당 월을 입력하세요.");
			System.out.print(PROMPT_M);		
			int month = scan.nextInt();   // 위 주석처럼 먼저 선언, 초기화을 해도 된다

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
