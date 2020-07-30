package day08;

import java.util.Arrays;

/*
  	문제 2]
  	
  		"Hong Gil Dong" 이라는 문자열을 한글자식 꺼내서 출력하세요
  		단, 꺼내는 함수는 substring()을 이용해서 처리하세요.
  		
  		bonus ]
  		
  			문자배열로 만들어서 출력하세요.
 */


public class Ex02 {
	public static void main(String[] args) {
		// 문자열 변수에 데이터 채우고...
		
		String str = "Hong Gil Dong";
		/*
		System.out.print("|");
		for(int i = 0; i < str.length(); i++) {
			System.out.print(str.substring(i,i+1) + " | ");
		}
		System.out.println();
		*/
		
		/*
		// 문자열 배열에 담아보자.
		String[] arr = new String[str.length()];		
		for(int i = 0; i < str.length(); i++) {
			arr[i] = str.substring(i, i+1);
		}
		System.out.println(Arrays.toString(arr));
		arr[arr.length -1] = str.substring(str.length() -1);
		
		// 하나씩 꺼내서 출력하고
		for(int i = 0; i < arr.length ; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();
		*/
		
		/*
		// 문자 배열로 만들어서 출력하자
		char[] chArr = new char[str.length()];
		// 데이터 채우고
		for(int i = 0; i < chArr.length; i++) {
			chArr[i] = str.charAt(i);
			System.out.print(chArr[i] + " | ");
		}
		*/
		
		//문자열에서 문자배열을 추출해서 처리하는 방법
		
		char[] chArr = str.toCharArray();
		System.out.print(" |");
		
		
		
	
	
	}
}
