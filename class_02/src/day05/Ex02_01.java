package day05;

import javax.swing.JOptionPane;

public class Ex02_01 {
	public static void main(String[] args) {
		//문자열로 입력받고
		String sno = JOptionPane.showInputDialog("문자를 입력하세요");
		
		// 정수로 비교하는 방법
		int no = Integer.parseInt(sno);
		int tmp = no;
		int result = 0;
		
		for(int i = 0 ; i < sno.length(); i++ ) {
			result = result*10 + (tmp % 10);
			tmp /= 10;
		}
		
		String msg = "회문수가 아니다.";
		
		if(no == result) msg = " 회문수다.";
		
		JOptionPane.showMessageDialog(null, " 입력한 숫자 " + no +" 는 " + msg );
	}		
}
