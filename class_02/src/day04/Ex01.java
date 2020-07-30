package day04;

/*
 	랜덤하게 두자리 숫자를 발생시키고
 	키보드로 두자리 숫자를 입력하면
 	발생된 숫자보다 입력한 숫자가 큰 수인지 아닌지 판별하는 프로그램을 작성하세요

 	심화]
 		입력한 수와 차는 얼마인지 같이 출력하도록 하세요
 
 	(Rnum > sc) ? (Rnum-sc) : (sc-Rnum)
 	
 */


import java.util.*;

public class Ex01 {
	public static void main(String[] args) {
		
		// 랜덤으로 2자리 숫자 생성
		int Rnum = (int)(Math.random()*(100-1));
		// 랜덤 생성숫자 출력
		System.out.println("랜덤으로 생성된 숫자 :" + Rnum);
		
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력해달라는 메세지 출력
		System.out.print("숫자를 입력하세요 : ");
		
		// 키보드에서 2자리 숫자를 입력받는다.
		int num2 = sc.nextInt();

		
		
		System.out.println((Rnum > num2) ? "랜덤생성수 > 입력한 수 이고, 차는" + (Rnum - num2) + "입니다" 
				: "입력수 > 랜덤생성수 이고, 차는"+  ( num2 - Rnum) + "입니다" );
		
	}
}
