package day19;

/*	
 	문제 5 ]
	 	이메일을 입력받아
	 	형식에 맞는지 아닌지 판별해서 출력하세요
	 	
	 	aaa@gmail.com co.kr .net
	 	
	 	모든 한글 : [가-힣]
 */

import java.util.regex.*;
import javax.swing.*;

public class Test09 {

	public Test09() {
		Pattern pattern = Pattern.compile("^[a-zA-z0-9가-힣_$].*[@]([[a-zA-z0-9가-힣].[a-zA-z0-9가-힣]]|[[a-zA-z0-9가-힣]])");
	
		String email = JOptionPane.showInputDialog("이메일 주소를 입력하세요!");
		
		Matcher match = pattern.matcher(email);
		
		String msg = match.matches() ? "올바른 이메일 형식입니다." : "이메일 형식이 아닙니다.";

		
		JOptionPane.showMessageDialog(null, "입력한 이메일은 : "+ email + "이고 \n" + msg);
	}

	public static void main(String[] args) {
		new Test09();
	}

}
