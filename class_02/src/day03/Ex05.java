package day03;

import java.util.Scanner;
/*
  	문제 5]
  		알파벳 문자를 임의로 입력한 후 
  		그 문자가 대문자이면 소문자로 변환하고,
  		소문자면 대문자로 변환하여
  		특수문자면 그냥 출력하라.
  		
  	참고]	아스키코드값 사용
  		'A' : 65
  		'a' : 97
  		

  		int char = 'a' - 'A'
  		
  	참고 ]
		수학 식으로 표현하면
	
			0 < math.random() <1.0
			
	사용방법 ]
	
		랜덤한 정수 발생방법
		
		(int)(Math.random() * (큰수 - 작은수 +1)) + 작은수
		
		1~10 사이의 정수를 랜덤하게 발생시켜본다.
		
		(int)(Math.random() * (10-1) +1) + 1
		
		char ch = (char)(Math.random() * (255 - 0) + 1);
		println(ch);
 */





public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("문자를 입력하세요: ");
		
		char ch = sc.nextLine().charAt(0); 
				
		System.out.println("입력한 문자 "+ch);
		
		System.out.println((ch >= 'A' && ch <= 'Z')?
							("변환된 문자 "+(char)(ch+('a'-'A')))
							: "변환된 문자 "+(char)(ch-('a'-'A')));
		
		
		
		
	}
}
