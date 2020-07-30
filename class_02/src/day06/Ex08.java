package day06;
/*
	문제]
	
				★
 			   ★★★
 			  ★★★★★
 			 ★★★★★★★
 			   
 */

public class Ex08 {
	public static void main(String[] args) {
		
		for(int i = 0; i < 5 ;i++) {
			for(int j = 0; j < 5 ; j++) {
				
				if((i+j+1)<5) {
					System.out.print(" ");
				} else {
					System.out.print("★");
				}
				
			}
			
			for(int j = 0; j<5; j++) {
				if((i+j+1)>5) {
					System.out.print("★");
				} else {
					System.out.print("");
				}
			}
			
			System.out.println();
		}
	}
}
