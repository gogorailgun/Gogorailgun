package day04;

	/*
 		랜덤하게 다섯자리 숫자를 만들고
 		각 자리의 숫자의 합을 구해서 출력해주는 프로그램을 작성하세요
 		
 		12345 ==> 1 + 2 + 3 + 4 + 5 를 합한 값
	 */

public class Ex02 {
	public static void main(String[] args) {
		
		
		//랜덤하게 생성된 5자리수
		int Rnum = (int)(Math.random()*(99999 -10000 +-1)+10000);
		int tmp = Rnum;
		
		int no1 = Rnum / 10000; //만자리
		tmp = Rnum - (no1*10000);
		
		int no2 = tmp / 1000;
		tmp = tmp - (no2*1000);
		
		int no3 = tmp / 100;
		tmp = tmp - (no3*100);
		int no4 = tmp / 10;
		tmp = tmp - (no4*10);
		int no5 = tmp;
		
		int sum = (no1+ no2 + no3 + no4 + no5);
		
		
		System.out.println("랜덤 생성된 수는 : " + Rnum); 
		System.out.println("모든 수를 더한 값은 : " + sum);
/*		
		int num2 = (Rnum %1000); //- (num1 * 10);
		
		int num3 = (Rnum %100);
		int num4 = (Rnum %10);
		int num5 = (Rnum %1);
		
		
		System.out.println(num2);
		
		
		
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
	*/	
		
		
		// charAt(0)+
		
	}

}
