package day07;

/*
  	다섯 학생의 국어, 영어, 수학, 코딩, 총점을 관리할 배열을 만들고 - 5개의 배열 필요
  	랜덤하게 과목 점수를 만들어서 입력하고
  	총점을 계산하세요.
  	
  	1. 각 과목의 배열을 만들고 점수를 입력해서 배열을 완성하고
  		2차원 배열로 합쳐서 처리하는 방법
  		
  	2. 2차원 전채 배열로 처리하는 방법
  	
  	
  	
  	
  	보너스
  		점수가 높은 사람부터 접렬해서 출력하세요.
  	
 */

import java.util.*;

public class Ex03 {
	public static void main(String[] args) {
		
	
		// 일차원 배열 만들고 이차원 배열로 합치는 방법.
		
		int kor[] = new int[5];
		int eng[] = new int[5];
		int math[] = new int[5];
		int cording[] = new int[5];
		int sum[] = new int[5];
		
		int score[][] = new int[5][5];
		
		for(int i = 0; i < 5; i++) {
			for(int j=0; j<5; j++) {
				int no1 = (int)(Math.random()*99+1);
				kor[i] = no1;
				int no2 = (int)(Math.random()*99+1);
				eng[i] = no2;
				int no3 = (int)(Math.random()*99+1);
				math[i] = no3;
				int no4 = (int)(Math.random()*99+1);
				cording[i] = no4;
				int no5 = (int)(Math.random()*99+1);
				sum[i] = no1+no2+no3+no4;
				
			}
			
			
			System.out.println("국어: "+kor[i]+" 영어: " +eng[i]+" 수학: "+ math[i]+" 코딩: "+cording[i]+" 총점 "+sum[i]);
		}
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		
		score[0]= kor;
		score[1]= eng;
		score[2]= math;
		score[3]= cording;
		score[4]= sum;
		
		for(int j = 0; j < 5 ; j++) {
			System.out.printf("%d번째 학생의 국어점수: %2d, 영어점수 : %2d, 수학점수 : %2d, 코딩점수 : %2d, 총점 : %3d\n",(j+1),score[0][j],
										score[1][j],score[2][j],score[3][j],score[4][j]);
		}
		
		
/*	
		int score[][] = new int [5][5];
		
		for(int i = 0; i < score.length ; i++) {
			for(int j = 0; j<score[i].length; j++);{
				
				int no = (int)(Math.random()*99+1);
				score[i][j] = no;
				
				int no2 = score[i][j];
				
				
				
				
				
			}
				
				
			
		}
		*/
		
	}
}
