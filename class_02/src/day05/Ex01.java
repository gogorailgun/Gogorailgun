package day05;


//for 반복문을 사용해서 소문자 'a' 시작해서 알파벳 다섯개를 출력하세요.
public class Ex01 {
	public static void main(String[] args) {
		System.out.print(" | ");
		for(int i = 0; i < 5 ; i++) {
			System.out.print((char)('a' + i) + " | ");	
		}
		/*
		int i = 0;
		for(;;)
			if(i ==3) {
				break;
			}
		*/
	}
}
