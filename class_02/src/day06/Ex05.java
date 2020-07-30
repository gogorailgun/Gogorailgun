package day06;
/*
	반복문 문제
	
	문제]
				i+j
 		*							
 	   **					1+4		1+4
 	  ***			2+2		2+3		2+4		
 	 ****
 	*****
	
*/
public class Ex05 {
	public static void main(String[] args) {
		
		for(int i =0; i<5; i++) {
			for(int j = 0; j<5; j++) {	
				
				if(j+i < 5) {
					System.out.print(" ");	
				} else {
					System.out.print("★");
				}
				
			}
			
			System.out.println("★");
		}
	}

}
