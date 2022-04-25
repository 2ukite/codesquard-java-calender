package tokkic.calendar;

import java.util.Scanner;

public class Prompt {

	private final static String PROMPT = "cal>";

	public void runPrompt() {

		Scanner scan = new Scanner(System.in);
		Calendar cld = new Calendar();

		while (true) {

			System.out.println("월을 입력하세요.");
			System.out.print(PROMPT);
			
			int month = scan.nextInt();

			if (month <= -1) 
				break;
			
			if (month >= 13) 
				continue;
			
			cld.printCalendar(2022, month);
		}
		System.out.println("Have a nice day!");
		scan.close();
	}

	public static void main(String[] args) {
		Prompt p = new Prompt();
		p.runPrompt();
	}
}
