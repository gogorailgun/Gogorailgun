package day18;

public class Test02 {

	public Test02() {
		Test02_01 t1 = new Test02_01();
		
		try {
			t1.createExcpt(); // 이 함수는 예외를 전이하는 함수이므로 함수를 호출한 곳에서 예외처리를 한다
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		try {
			abc();
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		Test02_02 t2 = new Test02_02();
		t2.createExcpt();
	}
	
	
	public void abc() throws Exception{
		Test02_01 t1 = new Test02_01();
		t1.createExcpt(); // 이 함수는 예외를 전이하는 함수이므로 함수를 호출한 곳에서 예외처리를 한다

	}

	public static void main(String[] args) {

	}

}

class Test02_01{
	public void createExcpt() throws Exception {
		
		System.out.println("여기는 Test02_01");
		throw new Exception(); // 강제로 예외를 발생했으니 이 라인이 실행이 되면 무조건 예외가 발생한다.
	}
}

class Test02_02 extends Test02_01{
	public void createExcpt() throws NumberFormatException{
		
		System.out.println("여기는 Test02_02");
		throw new NumberFormatException();
	}
}