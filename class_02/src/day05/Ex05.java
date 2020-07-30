package day05;

/*
 	문제 5]
 		주사위를 2개 던질 경우
 		두 눈의 합이 6이되는 경우를 출력하세요.
 		
 		no1 + no2 = 6
 */
public class Ex05 {
	public static void main(String[] args) {
		
		for(int i = 1; i <= 6 ; i++) {
			//첫번째 주사위 눈의 경우 반복
			for(int j = 1; j <= 6 ; j++) {
				//두번째 주사위의 경우의 수
				if((i+j) == 6) {
					System.out.println("첫번째 주사위 눈 : " + i +"\n두번째 주사위 눈: "+ j);
					break;
				}
			}
		}
	}
}