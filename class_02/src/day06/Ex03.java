package day06;

/*
  반복문 문제
  
  		문제 3]
  		
  			1	2	3	4	5
  			6	7	8	9	10
  			11	12	13	14	15
  			16	17	18	19	20
  			21	22	23	24	25
 */


public class Ex03 {
	public static void main (String[] args) {
		
		int num = 0;
		for(int i = 1; i<=5 ; i++) {
			for(int j= 0; j<5 ; j++) {
				num += 1;
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		
	}
}
