package day07;

import java.util.Arrays;

/*
 	정수 5개를 저장할 배열3개를 만들어서
 	첫번째 배열에는 랜덤하게 사각형의 가로의 길이를 만들어서 기억시키고
 	
 	두번째 배열에는 랜덤하게 사각형의 세로 길이럴 만들어서 기억시키고
 	세번째 배열에는 랜덤하게 만든 배열의 각 인덱스의 가로, 세로, 길이로 면적을 계산해서 저장할 배열을 만들어서
 	출력하세요.
 	
 	
 	
 	출력형식 :
 	
 	첫번째 사각형 : 가로 - xx | 세로 - XX | 넓이 - xxx
 	두번째 사각형 : 가로 - xx | 세로 - XX | 넓이 - xxx
 	세번째 사각형 : 가로 - xx | 세로 - XX | 넓이 - xxx
 	네번째 사각형 : 가로 - xx | 세로 - XX | 넓이 - xxx
 	다섯번째 사각형 : 가로 - xx | 세로 - XX | 넓이 - xxx
 	

  
 */
import java.util.*;
	
public class Ex02 {

	public static void main(String[] args) {
		// 가로를 저장할 배열 변수
		int garo[] = new int[5];
		// 세로를 저장할 배열 변수
		int sero[] = new int[5];
		// 넓이를 저장할 배열 변수
		int area[] = new int[5];
		
		
		
		
		for(int i=0; i<5; i++) {
				//가로를 랜덤 생성해서 저장
				int no1 = (int)(Math.random()*99+1);
				garo[i] = no1;
				
				// 세로를 랜덤 생성해서 저장
				int no2 = (int)(Math.random()*99+1);
				sero[i] = no2;
				// 넓이를 저장.
				area[i] = no1 * no2;
	

			System.out.println("첫번째 사각형 : 가로 - " +garo[i]+" | 세로 - "+sero[i]+" | 넓이 - "+area[i]);
			
		}
		
		
		
		System.out.println("##############################");
		// 2차원 배열에 담기
		
		int[][] sagak = new int[3][5];
		
		sagak[0] = garo;
		sagak[1] = sero;
		sagak[2] = area;
		
		for(int i =0; i<sagak[0].length; i++) {
			System.out.printf("%d 번째사각형 : 가로 - %2d, 세로 - %2d, 면적 - %4d\n",
									(i+1),sagak[0][i],sagak[1][i], sagak[2][i]);	
			}
		}
}

