package day02;

import java.util.Scanner;

public class Test13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("한변의 높이를 입력하세요! : ");
		int height = sc.nextInt();
		System.out.print("다른 변의 길이를 입력하세요! : ");
		int width = sc.nextInt();
		int area = height * width;
		int tri = area /2;
		
		System.out.println("한 변의 높이가 "+ height + "이고 다른변의 길이가 "
							+ width + "인 사각형의 넓이" + area + " 입니다.");
		System.out.println("한 변의 높이가 "+ height + "이고 다른변의 길이가 "
				+ width + "인 삼각형의 넓이는" + tri + " 입니다.");
	
	}
}

