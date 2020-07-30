package day05;
/*
 	문제 7]
 		랜덤한 두 수를 입력한 후
 		두수의 최대 공약수를 구하는 프로그램을 작성하세요
 	
 	힌트 ]
 		최대 공약수 구하는법
 		: 적은 수부터 시작해서 1씩 감소하면서
 			두 수가 나누어 떨어지는지 확인한다.
 		
 		
 */
public class Ex07 {
	public static void main(String[] args) {
		
		//랜덤한 두 수 생성
		int no1 = (int)(Math.random()*100);
		int no2 = (int)(Math.random()*100);
		
		int tmp = 1;
		
		//최대공약수 구하는법
		repeat:
		for(int i=1; i<100; i++) {
			if((no1%i) + (no2%i) == 0){
				tmp = (i*tmp)/tmp;
			} else {
				continue repeat;
			}
			// System.out.println(no1+" 과 "+ no2 + "의 최대 공약수는 "+ tmp);
		}
		System.out.println(no1+" 과 "+ no2 + "의 최대 공약수는 "+ tmp);
	}
}
