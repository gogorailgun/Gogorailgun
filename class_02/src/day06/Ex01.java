package day06;

/*
 	반복문 문제
 	
 	문제 1]
 	
 		0	1	2	3	4 ==> i = 0
 		1	2	3	4	5 ==> i = 1
 		2	3	4	5	6 ==> i = 2
 		3	4	5	6	7 ==> i = 3
 		4	5	6	7	8 ==> i = 4
 
 j 		1	2	3	4	5
 		
 		
 		출력
 */
public class Ex01 {
	public static void main(String[] args) {
		
		for(int i = 0; i<5; i++) {			
			for(int j =0; j<5; j++) {
				System.out.print((i+j)+"\t");
			}		
			System.out.println();		
		}
	}
}

