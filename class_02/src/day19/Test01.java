package day19;

public class Test01 {

	public Test01() {
		Object obj = 10;
		/*
		  	먼저 리터럴 풀에 담긴 데이터를 클래스 타입으로 변형시켜줘야 한다.
		  		int ==> Integer
		  	자동 형변환이 된다.
		  		Integer ==> Object
		 */
		
		
		Object str = "abcd";
		
		String str1 = (String)str;
		
		Integer no = null; // 클래스 타입에는 됨.
		// int no = null; 참조형 타입은 안됨
	}

	public static void main(String[] args) {
		new Test01();
	}

}
