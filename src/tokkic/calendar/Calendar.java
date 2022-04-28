package tokkic.calendar;

public class Calendar {

	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	private static final int[] MAX_LEAP_DAYS = { 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public boolean isLeapYear(int year) {
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getMaxDaysofMMonth(int year, int month) {
		if (isLeapYear(year)) {
			return MAX_LEAP_DAYS[month - 1];
		} else {
			return MAX_DAYS[month - 1];
		}
	}

	public void printCalendar(int year, int month) {

		int countDay = calTotalDay(year, month);
		int St_blankDay = 4; // 1970년 1월 1일은 목요일이다. (목요일의 wDay_num 는 4 이다)
		int make_blankDay = countDay % 7;
		int sum_blankDay = St_blankDay + make_blankDay;
		int fin_blankDay = sum_blankDay % 7;
		int maxDay = getMaxDaysofMMonth(year, month);

		System.out.printf("  << %4d년 %3d월 >>\n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for (int i = 0; i < fin_blankDay; i++) {
			System.out.print("   ");
		}

		for (int i = 1; i <= maxDay; i++) {
			System.out.printf("%3d", i);
			if ((fin_blankDay + i) % 7 == 0) {
				System.out.println();
			}
		}

		System.out.println(); // 달력 출력 후 재입력 전 한 칸 띄워주기
	}

	// 1970년 1월 1일을 기준일로 잡아 이후 날짜의 그 달 1일 요일 계산하기. 효율은 떨어지지만 학습의미에서 해보자
	private int calTotalDay(int year, int month) {

		int c_year = year - 1970;

		// 연 월 일 별로 차이나는 날 수 계산
		int count = 0; // 차이 나는 day 수

		for (int i = 0; i < c_year; i++) {

			if (isLeapYear(i + year)) {
				count += 366;
			} else {
				count += 365;
			}
		}

		for (int i = 1; i < month; i++) {
			count += getMaxDaysofMMonth(year, i);
		}

		return count;
	}
}