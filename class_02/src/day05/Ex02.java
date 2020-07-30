package day05;

/*
 	예제 2]
 		5자리 숫자를 입력받아서
 		그 숫자가 회문수인지 아닌지 판별하세요
 		단, for 반복문을 사용해서 처리하세요
 */

import javax.swing.*;

public class Ex02 {
	public static void main(String[] args) {
		//문자여로 입력받고
		String Sno = JOptionPane.showInputDialog("문자를 입력하세요");
		
		// 1. 문자열로 비교하는 방법
		// 참고 ] 문자열의 길이를 변환해주는 함수 : langth()
		
		String tmp ="";
		int len = Sno.length();
		
		//역순으로 된 문자열을 반복해서 만든다
		for(int i = 0; i < len ; i++) {
			
			tmp += Sno.charAt((len-1) -i);
				  
			}
		boolean bool = Sno.equals(tmp);
		
		if (bool == true) {
			JOptionPane.showMessageDialog(null,"입력한 숫자" + Sno +"는 회문수 입니다.");
		} else {
			JOptionPane.showMessageDialog(null,"입력한 숫자" + Sno +"는 회문수가 아닙니다");
		}
	}		
		
}
