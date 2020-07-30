package day05;

/*
 	문제 4]
 		1 - 2 + 3 - 4 + 5 - 6 ... 를 계산했을때
 		어디까지 계산해야 100이 나오는지 출력하세요.
 		
 		1 + (3-2) + (5-4)
 		
 		no +  no   +  no               no == (3-2)
 		 		
 	힌트 ]
 		-1은 -1을 곱할 때마다 부호가 바뀐다.
 */


public class Ex04 {
	public static void main(String[] args) {
		int sum = 0;
		int buuho = -1;
		int num = 1;
		
		for(int i = 1; true; i++) {
			buuho *= -1;
			sum = sum + buuho * i;
			if(sum >= 100) {
				num = i;
				break;
			}			
		}
		
		System.out.println("더한 값이 100이상이 되는 숫자는 "+ num+ " 이고 합은 " + sum);
	}
}
	

