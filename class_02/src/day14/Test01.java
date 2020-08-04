package day14;

public class Test01 {
	
	public Test01() {
		Test01_01 t1 = new Test01_01();
		System.out.println(t1.no);
		System.out.println(t1.getRndn());
		System.out.println(t1); // 변수를 바로 출력하게 되면 해당 변수가 가지고있는 toString 함수가 호출이 된다.
		// 
	}

	public static void main(String[] args) {
		new Test01();
	}

}

class Test01_01{
	int no = 100;
	public int getRndn() {
		return(int)(Math.random()*13+3);
	}
	
	public String toString() {
		return "이 클래스는 변수가 no " +no+ "이고 getRndn() 를 맴버로 가지는 Test01_01 클래스 입니다.";
 	}
}