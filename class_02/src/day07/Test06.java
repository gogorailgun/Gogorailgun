package day07;

import java.util.Arrays;

/*
   1 ~ 45 까지의 숫자 여섯개를 저장할 배열을 만들고 정렬하세요.
   중복 숫자는 없는것으로 한다
 */


public class Test06 {
	
	public static void main(String[] args) {
		
		int lotto[] = new int[6];
		
	for(int count = 0; count<10; count ++) {
		
		
			
			
			
		
			
			loop:
			//반복해서 숫자 만들고
			for(int i = 0; i < 6 ; i++) {
				// 1~45 랜덤숫자 생성하고
				int no = (int)(Math.random()*45 +1);
				
				// 중복된 숫자가 있는지 검사한다.
				for(int j=0; j<i; j++) {
					if(lotto[j] == no) {
						--i; // i를 즉시 빼줌, 다시 회차를 돌려서 번호를 생성해라.
						continue loop;
					}
				}
				// 이 경우는 중복된 숫자가 없는 경우이므로 배열에 추가해주면 된다.
				
				lotto[i] = no;
			}
			// 내용 확인
			//System.out.println(Arrays.toString(lotto));
			
			//오름차순 정렬
			for(int i = 0; i<lotto.length -1; i++) {
				
				for(int j = i+1; j<lotto.length; j++) {
					if(lotto[i] > lotto[j]) {
						int tmp = lotto[i];
						lotto[i] = lotto[j];
						lotto[j] = tmp;
					}
				}
			}
			// 내용 확인
			
			
			
		/*	for(int i = 0; i<10; i++) {
				int count = 0;
				count += i;
				
				System.out.println(Arrays.toString(lotto));
				if(count>6) {
					System.out.println();
				}
		 */
			
			if(count==5) System.out.println("--------------------------");
				 System.out.println(Arrays.toString(lotto));
			 
		}
	}
}
