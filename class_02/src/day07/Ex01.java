package day07;

import java.util.Arrays;

/*
 
 	문제 1]
 		
 		대문자 'A' ~ 'J" 대문자를 랜덤하게 100개 발생시켜서
 		각	문자가 몇번씩 발생되는지
 		그래프 형태로 출력하세요.
 
 		예]
 		
 			A(5) : *****
 			B(3) : ***
 			
 			
 			int[] count = new int[10];
 */

public class Ex01 {
	public static void main(String[] args) {
		
		//나올 문자들을 선언
		String chStr = "ABCDEFGHIJ";
		
		
		// 나온 문자의 수를 카운터할 배열을 생성하는데 그 길이를 chStr의길이만큼 만듬
		int[] arr = new int[chStr.length()];
		
		
		
		//100개의 랜덤 문자를 생성
		for(int i =0; i<100; i++) {
			int idx = (int)(Math.random() *10);
			arr[idx] += 1;
			}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.printf("%2c (%2d) : ", chStr.charAt(i), arr[i]);
			for(int j =0 ; j< arr[i]; j++) {
				System.out.print("★");
			}
			System.out.println();
			}
	}
}
