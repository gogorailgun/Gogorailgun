package day15;

public class Test01 {
	public Test01() {
		Son s = new Son();
		Father f = s; // 자동 형변환
		Son2 s2 = (Son2)f; // 강제 형 변환, 구문상 오류는 없지만 실행시 에러난다.
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Father{
	
}

class Son extends Father{
	
}

class Son2 extends Father{
	
}