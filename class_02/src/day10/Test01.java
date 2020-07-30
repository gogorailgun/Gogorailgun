package day10;

public class Test01 {
	
	/*
		다른 함수를 호출하는데 생성자 함수를 하기 위해서.
		앞으로 함수나 코드의 내용을 실행할 때는
		생성자 함수를 이용햐해서 실행해보자
	
	*/
	int no = 10;
	public Test01() {
		// 생성자 함수는 반환값타입이 존재하지 않고
		// 기본 생성자 함수는 생성자 함수를 매개변수리스트가 존재하지 않는 함수를 기본 생성자 함수라고 한다.
		// 주로 맴버변수 초기화하는데 사용한다.
	}
	public static void main(String[] args) {
		new Test01();
		 
		
		//System.out.println(t01.no); 귀찮아서 이렇게 안씀
		
	}
	
	void abc() {
		System.out.println("여기는 abc함수 입니다");
	}

}
