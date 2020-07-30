package day06;
/*
 	반복문 문제
 	
 		문제 4 ]
 									i행
 			1						1	
 			2	3					2
 			4	5	6				3
 			7	8	9	10			4
 			11	12	13	14	15		5
 			
 	   J열  1   2   3    4   5 
 */
public class Ex04 {
	public static void main(String[] args) {
		
		//변수 미사용
		
		for(int i =0; i < 5; i++) {
			for(int j=0; j <= i ; j++) {
				System.out.print((j+i+1)+"\t");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		/*  //변수 사용
		int num = 0;
		
		for(int i =0; i<5; i++) {
			for(int j = 0; j<=i; j++) {
				
				num += 1;
				System.out.print(num+"\t");
			}
			System.out.println();
		 	}
		 */
	}
}
