package day13;

public class Test07 {

	public Test07(){
		Father f = new Father();
		f.toPrint();
		
		Son s = new Son();
		s.toPrint();
		
		f = s;
		
		System.out.println("Son.num : " +s.num);
		System.out.println("Father.num : " +f.num); // 함수는 인스턴스 쪽을 따르고,
		//변수는 레퍼런스 변수쪽을 따른다. 함수는 인스턴스에서 오버라이딩 한 함수가 호출된다.
		f.toPrint();
		
		s = (Son)f;
		
		// 클래스 타입의 비교는 Member로 비교해야한다.
		// Member를 많이 가지고 있는 클래스가 큰가?
		// 멤버만 그 인스턴스 안에 들어있으면 
		
	}
	
	public static void main(String[] args) {
		new Test07();
	}

}

class Father {
	int no = 1000;
	int num = 11;
	public Father() {}
	public Father(int no) {
		this.no = no;
	}
	public void toPrint() {
		System.out.println("여기는 아빠 no : " + no);
	}
}

class Son extends Father{
	int num = 22;
	public Son() {
		super(10000);
		
	}
	public void toPrint() { // 함수의 오버라이딩(함수의 재정의)
		System.out.println("여기는 아들 no : " + no);
	}
}