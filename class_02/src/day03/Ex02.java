package day03;

import java.util.Scanner;
/*
 	문제 2]
 		세자리 숫자를 입력받아서
 		그 수가 300보다 크면 "300보다 큰 수"
 		작으면 "300 보다 작은 수"
 		가 출력되게 하세요.
 
 */

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 키보드로 숫자 입력 준비
		// 정수 형태를 입력받는다
		System.out.print("숫자를 입력하세요 ");
		int no1 = sc.nextInt();
		
		System.out.println((no1>300) ? "300보다 큰수" : "300보다 작은 수");

		}
	}
