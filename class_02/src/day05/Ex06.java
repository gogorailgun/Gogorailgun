package day05;

/*
 	문제 6]
 	
 	 	수학 방정식 
 	 		2x + 4y = 10
 	 	의 결과를 출력하세요.
 	 	
 	 		x + 2y = 5;
 	 	    1   2 * 2 = 5
 	 	
 	 	단, x , y는 모두 0보다 크거나 같고 10보다 작거나 같다.
 */
public class Ex06 {
	public static void main(String[] args) {
		
		int num = 0;
		repeat:
		for(int i=0 ; i < 10; i++) {
			for(int j = 0; j<10; j++) {
				if((2*i + 4*j)==10) {
				System.out.println("2x + 4y = 10의 해 x는 " + i +" / y는 "+ j);
				continue repeat;
				}
			}
		}
	}

}
