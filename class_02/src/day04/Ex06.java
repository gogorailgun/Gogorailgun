package day04;

/*
  	조건문문제 3]
  		정수 세개를 압력받아서 제일 큰 수부터 출력하세요.
 */
import java.util.*;

public class Ex06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요");
		int no1 = sc.nextInt();
		
		System.out.println("두번째 숫자를 입력하세요");
		int no2 = sc.nextInt();
		
		System.out.println("세번째 숫자를 입력하세요");
		int no3 = sc.nextInt();
		
		if(no1>no2) {
			if(no2>no3) {
				System.out.println("가장 큰 수는"+ no1+ ", " + no2 + ", " + no3 + "입니다");		
			} else {
				System.out.println("가장 큰 수는"+ no1+ ", "  + no3+ ", "  + no2 + "입니다");	
			}
			
			} else if(no1<no3){
				if(no2<no3) {
					System.out.println("가장 큰 수는"+ no3+ ", " + no2+ ", " + no1 + "입니다");
				} else {
					System.out.println("가장 큰 수는"+ no3+ ", " + no1 + ", " + no2 + "입니다");
				}
				
			} else {
				if(no1>no3) {
					System.out.println("가장 큰 수는"+ no2+ ", " + no1+ ", " + no3 + "입니다");
				}
				else {
					System.out.println("가장 큰 수는 "+ no2 +", "+ no3 +"," + no1 + " 입니다");
				}
			}
		
	}
}
