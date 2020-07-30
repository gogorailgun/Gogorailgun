package day04;

/*
 * 
 * 조건문 문제
 	문제 1] 두 수를 랜덤하게 발생시켜서 각각 변수에 담고
 	첫번째 수가 두번째 수보다 크면 "양수"
 	첫번째 수가 두번째 수보다 작으면 "음수"
 	같은 경우도 양수로 처리함. 
 
	
	
 */


public class Ex04 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*(100-1)+1);
		int no2 = (int)(Math.random()*(100-1)+1);
		
		if(no1 >= no2) {
			System.out.println("양수");
		} else {
			System.out.println("음수");
		}
		
		
		//System.out.println(no1 +" "+ no2);
	}
}
