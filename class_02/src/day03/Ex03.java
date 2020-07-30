package day03;

import java.util.Scanner;

/*
 	삼항 연산자 문제
 		문제 3]
 			정수 3개를 입력받아서 제일 큰 수부터 출력하세요.
 			
 		힌트]
 		
 			삼항 연산자도 중첩해서 사용할 수 있다.
 			() ? (삼항연산자) : (삼항 연산자)
 
 			1. 
 		ABC		a>b = true 이고 a>c를 비교하고 true 이면 b>c true === a>b>c 
 		ACB		a>b = true 이고 a>c를 비교하고 true 이면 b>c false === a>c>b 
 		CAB		a>b = true 이고 B>C = false 일때 a>c = true >> CAB 
 		BAC		a>b = false 일때 B>C = true 이고 a>c = true >>> BAC
 		BCA		a>b = false 일 B>C = false 이고 a>c = false >>> BCA
 		CBA		B>C = false 일때 a>C = false 이고 a>B = false >> CBA
 			 
 */


public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하세요");
		int A = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요");
		int B = sc.nextInt();
		System.out.println("세번째 숫자를 입력하세요");
		int C = sc.nextInt();
		
		System.out.println((A>B)?((A>C) ? ((B>C)? (A +">"+B + ">"+ C) : (A +">" + C + ">"+ B))
			:(C + ">" + A +">"+ B))
				:((B>C)?(A>C)? (B + ">" + A + ">" + C) : (B +">" + C +">" + A):(C +">"+ B + ">" + A)));
		
	}
	
}
