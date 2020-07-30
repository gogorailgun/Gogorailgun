package day06;

/*
  	반복문 문제
  	
  		문제]
  		
  			1	2	3	4	5		i*j+1	i*j+2 
  			10	9	8	7	6		
  			11	12	13	14	15		2*1+10 2*2
 			20	19	18	17	16		
 			21	22	23	24	25
*/


public class Ex09 {
	public static void main(String[] args) {
		
		
		int num=0;
		
		for(int i = 1; i<=5; i++) {
			for(int j = 1; j<=1; j++) {

				if(i%2==0) {
					System.out.print(num+10-j);
				}	else {
						System.out.print(num);
						num =+10;
				}
				
				
				
				
				// System.out.print();
			/*	
				if(i%2 == 0) {
					System.out.print(((i*5)-j)+1+"\t");
					
				} else {
					System.out.print(j +"\t");
				}
			}
			System.out.println();
		}
		*/

			}
			System.out.println();
		}
	}
}
		
