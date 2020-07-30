package day08;

import java.util.Arrays;

/*
  	문제 6]
  		int[] no1 = {10, 20, 30, 40, 50};
  		
  		no1의 데이터를 복사해서 no2를 만드는데
  		
  		{40,50, 0, 10, 20}
  		의 형태로 만드세요.
 
  
  
  
 
 */

public class Ex06 {

	public static void main(String[] args) {
		
		int[] no1 = {10, 20, 30, 40, 50};
		int[] no2 = new int[5];
					
		
		no2 = no1;
		
		no2[0] = 40;
		no2[1] = 50;
		no2[2] = 0;
		no2[3] = 10;
		no2[4] = 20;
		
		
		System.out.println(Arrays.toString(no1));
		System.out.println(Arrays.toString(no2));

	}

}
