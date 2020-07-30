package day05;

import javax.swing.*;

public class Ex02_02 {
	public static void main(String[] args) {
		//3. 문자로 비교하는 방법
		
		String sno = JOptionPane.showInputDialog("다섯자리 숫자 입력");
		
		// 반복문으로 하나식 문자를 꺼내서 비교한다.
		// 먼저 변수를 만들어서 초기화 해둔다.
		
		boolean bool = true;
		for(int i = 0; i < sno.length() /2 ; i++) {
			char ch1 = sno.charAt(i);
			char ch2 = sno.charAt(sno.length() - 1 - i);
			
			if(ch1 != ch2) {
				// 반복문이 중지된 경우 bool 변수 값을 변경시킨다.
				// ch1과 ch2가 같지 않으면 true , 같다면 false
				bool = false;
				break;
			}
			
		}
		
		// 이제 변수의 내용을 확인해서 판별하면 된다.
		String result = "회문수가 아니다.";
		if(bool) {
			result = "회문수이다";
		}
		
		JOptionPane.showMessageDialog(null,"입력한 숫자" + sno + "는" + result);
		
		/*
		 	flag 기법
		 		: 프로그램을 실행하다보면
		 		 	두가지 이상의 경우가 발생되는 순간이 존재한다.
		 			그 후 어떤 경우가 발생했는지 확인하는 기법
		 */
		
		/*
		
		int sum = 0;
		boolean bool = true;
		
		for(int i = 0; i < 10; i++) {
			if((i + 1) % 5 == 0) {
				bool = false;
				continue;
			}
			sum += i + 1;
		}
		
		if(bool = true) {
			System.out.println("반복문 완벽 실행");
		} else {
			System.out.println("반복문 중간에 건너뜀");
		}
	
		System.out.println(sum);
	*/
	}
	
	
}
