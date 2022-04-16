package tokkic.calendar;

import java.util.Scanner;

public class Sum {
	public static void main(String[] args) {
		int a, b;
		
		// 키보드로 두 수의 입력 받기
		Scanner scan = new Scanner(System.in);
		String s1, s2;
		System.out.println("두 수를 입력해주세요");
		s1 = scan.next();
		s2 = scan.next();
		a = Integer.parseInt(s1);
		b = Integer.parseInt(s2);
		
//		System.out.println(a);
//		System.out.println(b);				
				
		//  화면에 두 수의 합을 출력하기
		System.out.printf("%d와 %d의 합은 %d 입니다",a,b,a+b);
		
		scan.close();
		
        	}
}
