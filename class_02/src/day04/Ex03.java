package day04;

/*
 	문제3] 
 		다섯자리 숫자를 입력받아서
 		그 숫자가 회문수인지 아닌지 판별해서 출력하세요
	
	참고] 회문수란 앞으로보나 뒤로보나 똑같은 수를 회문수라 한다.
	
	12321 11111
	문자열 데이터를 비교할때는 동등비교 연산자로 비교하지 마라.
	변수에 데이터가 기억될 때는 데이터가 기억되는게 아니라 리터럴 풀에 쌓여있는 주소를 기억하기때문에
	혹은 힙 영역에 만들어진 그 객체의 주소를 기억하기 때문에 결과값이 같은 값을 기억하고 있더라도 다른 결과가 나올 수 있다.
	
	문자열 비교는 equals 함수를 사용 << 객체일때 비교 가능
 */
import java.util.*;
public class Ex03 {
	public static void main(String[] args) {	
		
		//입력받을 준비
		Scanner sc = new Scanner(System.in);
		//입력 메세지 출력
		System.out.print("다섯자리 숫자를 입력하세요 : ");
		
		// a 에 입력된 수를 입력;
		String a = sc.nextLine();	
		System.out.println(a.charAt(0) == a.charAt(4) ? 
								(a.charAt(1) == a.charAt(3)? ( a +" 는 회문수입니다"): a + "회문수가 아닙니다")
								: "회문수가 아닙니다."
				); 
	
	}
}
