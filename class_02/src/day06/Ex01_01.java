package day06;

/*
 	반복문 문제
 	
 	문제 1]
 	
 		1
 		1	2
 		1	2	3
 		1	2	3	4
 		1	2	3	4	5
 		
 		출력
 */
public class Ex01_01 {
	public static void main(String[] args) {
		
		for(int i=0; i<5; i++) {
			for(int j = 0; j<=i ; j++) {
					System.out.print((j+1)+"\t");					
			}
			System.out.println("");
		}
	}
}
