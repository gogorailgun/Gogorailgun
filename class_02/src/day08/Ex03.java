package day08;

/*
 	문제 3]
 	
 		계산식을 입력하면
 		계산의 결과를 출력해주는 프로그램을 작성하세요
 		
 		예]
 		
 			계산식을 입력하세요 : 22-11
 			22-11 의 계산 결과는 11 입니다.
 			
 		보너스]
 			계산기 만들어주세요. (특정 키가 입력될때까지 계속 입력대기를 받는)
 */

//import java.util.*;

import javax.swing.*;

public class Ex03 {
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("계산식을 입력하세요! :");
		
		String[] sArr = new String[3];
		
	//	if(str.equals("q")){
	//		break;
	//	}
		
		/*
		  	str = "333-11"
		  	sArr[0] = "333";
		  	sArr[1] = "-";
		  	sArr[2] = "11";
		  
		 */
		int idx = 0; // 연산기호 위치를 저장할 변수
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i)< '0' || str.charAt(i) > 9) {
				idx = 1;
			}
		}
		
		sArr[0] = str.substring(0,idx);
		sArr[1] = str.substring(idx, idx+1);
		sArr[2] = str.substring(idx +1);
		
		// 숫자형태의 문자열을 정수로 변환시키고
		int num1 = Integer.parseInt(sArr[0]);
		int num2 = Integer.parseInt(sArr[2]);
		
		int result = 0;
		
		/*
		switch(sArr[1]) {
		case "+":
			result = num1 + num2; 
			break;
		case "-" :
			result = num1 - num2; 			
			break;
		case "*" :
			result = num1 * num2; 
			break;
		case "/" :
			result = num1 / num2; 
			break;
		case "%" :
			result = num1 % num2; 
			break;
					
		}
		
		*/
		
		
		char ch = sArr[1].charAt(0);
		if(ch == '+') {
			result = num1 + num2; 
		} else if (ch == '-') {
			result = num1 - num2; 
		} else if (ch == '*') {
			result = num1 * num2; 
		} else if (ch == '/') {
			result = num1 / num2; 
		} else if (ch == '%') 
			result = num1 % num2; 
		

		// 결과 출력하고
		JOptionPane.showMessageDialog(null, "주어진 식 : [" + str + "] 의 결과는 \n " + num1 +" "+ sArr[1] + " " + num2 +" = " + result );
		
		
		/*
		Scanner sc = new Scanner(System.in);
		String cal[] = new String[3];
		
		
		
		
		char[]giho = new char{+,-,*,/,%};
		
		String no1;
		String no2;
		String giho2;
		int tmp = 0;
		
		
		System.out.println("첫번째 숫자를 입력하세요");
		no1 = sc.next();
		cal[0] = no1;
		
		System.out.println("+, -, *, /, %를 입력하세요");
		giho = sc.next();
		cal[1] = giho;
		
		System.out.println("두번째 숫자를 입력하세요");
		no2 = sc.next();
		cal[2] = no2;
		
	
		
		
		if(giho.equals(cal[1])) {
			tmp = Integer.parseInt(no1)+Integer.parseInt(no2);
		} 
		else {
			System.out.println("입력기호 형식이 다릅니다.");
		}
		System.out.printf(cal[0] + cal[1] + cal[2]+ " = " + tmp);
		
		*/
	}
}
