package tokkic.calendar;

import javax.swing.text.html.parser.ParserDelegator;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] MAX_LEAP_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysofMMonth(int year, int month) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			return MAX_LEAP_DAYS[month - 1];
		else
			return MAX_DAYS[month - 1];
	}

	public void printCalendar(int year, int month, String weekday) {
		int blankDay;
		int wDay_num;
		
		Prompt prom = new Prompt();
		wDay_num = prom.parseDay(weekday);	
		blankDay = 7-wDay_num;
		int maxDay = getMaxDaysofMMonth(year, month);
		
		System.out.printf("    <<%4d년 % 3d월>>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for (int i = 0; i<wDay_num; i++) {
			System.out.print("   ");
		}
		
		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if (i % 7 == blankDay) {
				System.out.println();
			}
		}
		
		
		

		System.out.println();
//		System.out.println(" 1  2  3  4  5  6  7");
//		System.out.println(" 8  9 10 11 12 13 14");
//		System.out.println("15 16 17 18 19 20 21");
//		System.out.println("22 23 24 25 26 27 28");
	}
}