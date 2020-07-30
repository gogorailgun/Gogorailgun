package day11;

public class Test03_01 {

	
	public Test03_01(){ 
		// III
		//System.out.println("III");
		// Circle01 데이터 세개를 만들어 보자.
		Circle01 c01 =  new Circle01(); // c01 에는 Circle01 타입의 변수만 집어넣을 수 있다. 
		//기존 데이터 타입이 아닌 참조형이기 때문에 new 시켜서 집어넣어줘야 한다.
		
		// c01이라는 원의 반지름을 출력해보자.
		System.out.println("1. c01의 반지름 : " + c01.rad);
		System.out.println("1. c01의 반지름 : " + c01.arround);
		// 반지름을 입력해보자.
		c01.rad = 10;
		// c01이라는 원의 반지름을 출력해보자.
		System.out.println("2. c01의 반지름 : " + c01.rad);
		System.out.println("2. c01의 원둘레 : " + c01.arround);
		
		
		System.out.println("-----------------------------------");
		// 함수를 통해서 모든 변수의 데이터를 셋팅해보자.
		c01.setRad(7);
		// c01이라는 원의 반지름을 출력해보자.
		System.out.println("3. c01의 반지름 : " + c01.rad);
		System.out.println("3. c01의 원둘레 : " + c01.arround);
		
		// IV
		//System.out.println("IV");
		
		// 두번째 원을 만들어서 반지름을 3으로 하는 원으로 셋팅하자
		Circle01 c02 = new Circle01();
		// 반지름을 입력하면서 데이터셋팅
		c02.setRad(3);
		// c01이라는 원의 반지름을 출력해보자.
		System.out.println("4. c02의 반지름 : " + c02.rad);
		System.out.println("4. c02의 원둘레 : " + c02.arround);
		
		// 반지름이 15인 원을 만든다.
		Circle01 c03 = new Circle01();
		
		c03.setRad(15);
		System.out.println("5. c02의 반지름 : " + c03.rad);
		System.out.println("5. c02의 원둘레 : " + c03.arround);
		
	}
	public static void main(String[] args) {
		// I
		new Test03_01();
		//System.out.println("I");
		//System.out.println("NONE");
		// II
		//System.out.println("II");
	}	// 실행순서 : I - III - IV - II.
	
}

class Abc{

}