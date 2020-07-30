package day03;

import java.util.*;
//사용할 라이브러리 불러오기

public class Test02 {
	public static void main(String[] args) {
		// 입력받을 준비
		Scanner sc = new Scanner(System.in);
		// 입력메세지 출력
		System.out.print("이름을 입력하세요! : ");
		// 입력받은 이름 변수에 기억
		String name = sc.nextLine();
		// 나이 입력받을 메세지 출력
		System.out.print("나이를 입력하세요! : ");
		// 입력받은 나이 변수에 기억
		int age = sc.nextInt();
		// Scanner 닫고		
		sc.close();
		//출력
		System.out.printf("입력된 사람은 [%3s] : %3d 세", name, age);		
		
		
		/*
		 	참고] 
		 		Scanner 클래스도 시스템의 자원을 사용하는 클래스이므로
		 		더이상 사용하지 않으면 닫아주는것이 원칙이다.
		 		
		 		닫는 명령은	sc.close();
		 */
	}
}
