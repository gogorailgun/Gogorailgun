package day20;

import java.text.*;

public class Test03 {

	public Test03() {
		double num = 34567.8912;
		
		DecimalFormat form = new DecimalFormat("0,000,000.000");
		String str = form.format(num);
		/*
		  	숫자의 형식을 지정할 때
		  		0 : 무효숫자 표현
		  		# : 무효숫자 표현 안함
		 */
		// 문자열을 만든다
		System.out.println("num : "+ num);
		System.out.println("str : "+ str);
		System.out.println("------------------------");
		form = new DecimalFormat("#,###,###.###");
		
		String str2 = form.format(num);
		// 출력하기
		System.out.println("num : "+ num);
		System.out.println("str : "+ str2);
	}

	public static void main(String[] args) {
		new Test03();
	}

}
