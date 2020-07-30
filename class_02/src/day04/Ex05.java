package day04;

/*
  조건문 문제
  
  	201~500 을 랜덤하게 발생시켜서
  	그 수가 300보다 크면 " 300보다 큰 수"
  	작으면 "300보다 작은수"
  	가 출력되게 하세요 
  
 */
public class Ex05 {
	public static void main(String[] args) {
		int no1 = (int)(Math.random()*(500-200)+200);
		
		if(no1 >= 300) {
			System.out.println(no1 +"은 300보다 큰 수");
		} else {
			System.out.println(no1 +"은 300보다 작은 수");
		}
	}
}
