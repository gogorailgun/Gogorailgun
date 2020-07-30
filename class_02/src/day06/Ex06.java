package day06;

/*
 	반복문 문제
 	
 	문제]
 	
	 	*****
	 	****
	 	***
	 	**
	 	*
 	
 	
 */

public class Ex06 {
	public static void main(String[] args){
		// 열 출력	
		for(int i=0; i<5; i++) {
			//행 출력
			for(int j=0; (j+i)<5 ; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
