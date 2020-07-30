package day03;

/*
 	Bonus]
 		3자리 숫자(100~999)를 입력받아
 		이 숫자에서 가장 가까운 배수를 만들기 위해
 		얼마가 필요한지를 계산해서 출력하는 프로그램을 만들어서
 		출력해라
 		
 		출력 예]
 		
 			241 : 200이 가까우므로 41을 빼야한다
 			365 : 400이 가까우므로 35를 더해야한다.
 */
import java.util.*;
public class Bonus01 {
	public static void main(String[] args) {
		
		//랜덤하게 세자리 숫자를 만들어서 처리한다
		int no = (int)(Math.random() * (999-100 + 1) + 100);
		
		String str = (no % 100 < 50)? (no % 100)+ "를 뻬야" : (100 - (no / 100) +" 를 더해야");
		int num = (no % 100 < 50) ?
					(no / 100 * 100) :
					(no / 100 + 1)*100;
					
		
		
		System.out.printf("랜덤하게 발생한 세자리 숫자 %3d  는 %3d와 가까우므로, %6s 한다  ", no,num ,str);
		
		/*
		Scanner sc = new Scanner(System.in);
		//입력받을 준비
		System.out.println("세자리 숫자를 입력하세요! : ");
		// 세자리 숫자 입력 메세지
		int no = sc.nextInt();
		
		
		
		String msg = ((no == 300)) ? "과" : "보다";
		String str = (no > 300) ? "큰 수" : ((no == 300) ? "같은수" : "작은 수");
		
		String ex = ((no%100) < 50)? (no):() ;
		
		System.out.printf("입력한 숫자 %3d 은(는) %3s %4s 입니다", no, msg , str);
		*/
	}
}
