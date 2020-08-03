package day12;

/*
 	문제 3
 	
 		회원 정보를 기억할 클래스를 작성하세요
 		회원 정보는
 			회원번호, 회원이름, 아이디, 메일
 		
 		1. 회원 이름만 입력하면 객체로 만들 수 있게 한다.
 		2. 회원 이름과 아이디를 입력해야만 객체가 될 수 있게 한다 . 
 		3. 회원 번호, 회원이름, 아이디, 메일을 모두 입력해야 객체가 될 수 있도록 한다.
 		
 		생성자 함수 오버로딩 문제
 
 */

public class Ex03 {

	public Ex03() {
	//	fromName();
	//	nameAndId();
	}
	
	public static void main(String[] args) {
		new Ex03();
	}
	
	public void fromName() {
		// 이름을 입력해서 객체를 만들고 출력해보자.
		Jojikwon member = new Jojikwon("장발장");
		member.mno = 1001;
		member.id = "JYJ";
		member.mail = "ihatebread@increpas.com";
		System.out.println(member);
		
		
	}
	public void nameAndId() {
		Jojikwon member = new Jojikwon("조충현","cndgus123");
		//member.name =
	}
}
