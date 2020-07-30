package day10;

public class Test02 {

	/*
	  	정수 두개를 입력해서
	  	두 수를 더한 값을반환해주는 함수를 만들고 실행해보자
	  	
	  	참고 ]
	  	
	  		함수의 작성위치는 클래스블럭({})의 아무곳에서나 가능하다.
	  		자바에선 함수 내부에 함수를 만들수는 없다.
	  		위치는 클래스블럭 내라면 순서에 상관없이 만들 수 있다.
	 */
	
	// 이곳에 함수를 만들어도 된다.
	
	public Test02() {
		// 이곳에 함수를 만들면 절대로 안된다. 함수 내부에서는 함수를 절대로 만들 수 없다.
		
		/*
		  	기본 생성자 함수 작성형식
		  		
		  		public 클래스 이름(){
		  		
		  		}
		  	
		  	반드시 클래스 이름과 동일해야하고
		  	반환값이 있으면 절대로 안된다.
		  */
		
		int no1 = (int)(Math.random()*1000001);
		int no2 = (int)(Math.random()*1000001);
		
		// 더하기함수 실행해서 결과를 변수에 기억시키고
		int result = duhagi(no1,no2);
		
		//출력하고
		System.out.println("랜덤하게 발생된 두 수" +no1+","+no2+"의합은 "+ result + "입니다");
	}
	
	// 두 수를 입력하고 더한 결과를 반환해주는 함수
	public int duhagi(int no1, int no2) {
		/*
		 	 이 함수를 실행 할 때는 반드시 정수 데이터 두개를 입력을 해서 실행 할 것이다.
		 	 이때, 각 데이터는 no1, no2라는 변수에 대입 될 것이다.
		 	 
		 	 그러면 함수 내부에서는 입력되는 데이터를
		 	 no1과 no2 변수를 이용해서 처리하면 된다.
		 */
		int hap = no1 + no2;
		return hap;
	}
	
	
	public static void main(String[] args) {
		new Test02();

	}
	
	// 이곳에 함수를 만들어도 된다.

}
