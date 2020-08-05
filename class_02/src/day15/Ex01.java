package day15;
/*
  	
  	문제 1 ]
  	
  		랜덤하게 숫자를 발생시켜서
  		숫자가 홀수이면
  		 "홀수 클래스" Odd01
  		 
  		짝수이면 
  		"짝수클래스" Even01
  		출력이 되도록
  		
  		Type01 클래스를 상속받은 클래스를 각각 정의하고
  		함수를 오버라이드해서 처리하세요.
  		
 */


public class Ex01 {
	
	public Ex01() {
		int num = (int)(Math.random() * 16 + 5);
		System.out.println("num : "+ num);
		
		//변수선언하고
		if(num % 2 != 0) {
			new Odd01();
		} else {
			new Even01();
		}
		
		//Type01 t = (num % 2 != 0)? new Odd01() : new Even01();
	}
	
	public static void main(String[] args) {
		new Ex01();
	}

}

abstract class Type01{
	public abstract void numberIsOdd();
}

class Odd01 extends Type01{
	
	int num;
	String str;

	public Odd01() {
		numberIsOdd();
	}
	

	@Override
	public void numberIsOdd() {
		System.out.println("홀수클래스");
	}


	
}

class Even01 extends Type01{
	
	int num;
	public Even01() {
		numberIsOdd();
	}
	
	@Override
	public void numberIsOdd() {
		System.out.println("짝수클래스");
	}


}