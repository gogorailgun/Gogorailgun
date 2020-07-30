package day02;

public class Test07 {
	
	/*
		밑변이 10이고 높이가 5인 삼각형의 넓이를 기억할 변수를 만들고 초기화하세요.
		밑변과 높이의 변수도 선언하고 초기화하세요.
		
		공식]
			삼각형의 넓이 = 밑변 * 높이 * 1/2
	 */
	
	public static void main (String[] args){
		int width = 10;
		int hight = 5;
		float area = width * hight * 1/2;
		
		/*
		  1 / 2 ==> 0 : 정수와 정수의 연산결과는 정수가 되기 때문에
		  
		  1. ==> 1.0 : double 타입의 데이터
		 */
		
		System.out.println("삼각형의 밑변 : " + width);
		System.out.println("삼각형의 높이 : " + hight);
		System.out.println("삼각형의 넓이 : " + area);
	}
	
}
