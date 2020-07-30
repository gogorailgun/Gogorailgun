package day06;
/*
반복문 문제

	문제]
			
	 *****
 	  ****
  	   ***			2+2		2+3		2+4		
  	    **					1+4		1+4
	     *							


*/

public class Ex07 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5 ; i++) {
			for(int j=0; j<5; j++){
				
				if(i<=j) {
					System.out.print("★");
				} else {
					System.out.print(" ");				
				}
			}
			System.out.println();
		}
	}
}
