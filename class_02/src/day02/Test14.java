package day02;

import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요! : ");
		double PI = 3.14;
		int R = sc.nextInt();
		
		double Cround = (2 * PI * R);
		double Carea = (PI * R * R);
		
		System.out.println("반지름이 " + R + "인 원의 둘레는" + Cround + " 입니다.");
		System.out.println("반지름이 " + R + "인 원의 넓이는" + Carea + " 입니다.");
		System.out.printf("반지름이 %3d 인 원 ###\n\t%5s: : %6.2f\n\t5s: %5.2f, rad", "둘레");
		
		
	}
	
	
}
