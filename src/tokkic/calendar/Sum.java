package tokkic.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
//		int a, b;

		// 키보드로 두 수의 입력 받기
		Scanner scan = new Scanner(System.in);
		int s1, s2;
		System.out.println("두 수를 입력해주세요");
		s1 = scan.nextInt();
		s2 = scan.nextInt();

//		System.out.println(s1);
//		System.out.println(s2);

//		//  화면에 두 수의 합을 출력하기
		System.out.printf("%d와 %d의 합은 %d 입니다", s1, s2, s1 + s2);
		scan.close();
		
	}
}
