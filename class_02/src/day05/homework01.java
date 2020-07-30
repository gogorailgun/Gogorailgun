package day05;

/*
 	숙제 01]
 2 x  1=  2		3 x  1 =  3		4 x 1 = 4	 
 2 x  2=  4		3 x  2 =  6		4 x 2 = 8
 2 x  3=  6
 2 x  4=  8
 2 x  5= 10
 2 x  6= 12
 2 x  7= 14
 2 x  8= 16
 2 x  9= 18		3 x 9 = 27		4 x 9 = 36
 
 
 옆으로 쭉 진행하는거 되면 밑에 짤라서 하는거 진행 
6 x 1 = 6 		7 x 1 = 7		8 x 1 = 8	9 x 1 = 9

...
6 x 9 = 54 		7 x 9 = 63		8 x91 = 72	9 x 9 = 81
 */

public class homework01 {
	public static void main(String[] args) {
		
		
		for(int dan = 2; dan <9 ;dan++) {
			for(int gop=1 ; gop<10 ; gop++) {
					System.out.printf("%2d x %2d = %2d\t", dan,gop,dan*gop);
			}
			System.out.println();
		}
	}
}
