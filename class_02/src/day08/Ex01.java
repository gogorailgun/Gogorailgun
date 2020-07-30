package day08;

import java.util.Arrays;

/*
 	문자 10개를 랜덤발생 시켜서 출력
 	단 중복문자는 없다.
 */

public class Ex01 {
	public static void main(String[] args) {
		
		char[]str = new char[10];
		
		loop:
		for(int i = 0; i < 10; i++) {
			char ch = (char)(Math.random()*('Z'-'A'+1) + 'A');
			str[i] = ch;
			
			for(int j = 0; j < i; j++) {
				if(str[j] == ch) {
					i--;
					continue loop;
				}
			}
			
		}
		System.out.println(Arrays.toString(str));
	
	}
}
