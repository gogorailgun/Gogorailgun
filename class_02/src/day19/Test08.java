package day19;

/*
 	문제 4 ]
 		자바소스 파일 이름을 입력받아서
 		해당 파일이 정상적인 소스인지 아닌지 판별하세요.
 		
 		ex ]
 		
 			abc.txt ==> 자바소스파일이 아닙니다.
 */

import java.util.regex.*;
import javax.swing.*;

public class Test08 {
	public Test08() {
		// 패턴 만들고
		Pattern pattern = Pattern.compile("^([A-Z_$]){1}(\\w|[$_])*[.]java");
//		Pattern pattern = Pattern.compile("[A-Z_$]{1}[a-zA-z0-9$_]*[.]java");

		//Java.java
		// ^ - 시작
		// $ - 끝
		
		// 데이터 입력받고
		String file = JOptionPane.showInputDialog("파일 이름을 입력하세요!");
	
		if(file.equals("q")) {
			JOptionPane.showMessageDialog(null, "프로그램을 종료합니다!");
		}
 		
		// Matcher 만들고
		Matcher match = pattern.matcher(file);
		
		// 결과 꺼내고
		String msg = match.matches() ? "자바파일 입니다" : "자바파일이 아닙니다.";
		
		// 출력하고
		JOptionPane.showMessageDialog(null, "입력 한 파일 : " + file + "는\n" + msg);

		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
