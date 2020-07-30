package day11;

public class Test02 {
	Moyang mo1, mo2, mo3;
	
	public Test02() {
		setData();
		
		toPrint();
	}
	
	public void setData() {
		// Moyang 객체 세개를 만들어서 데이터를 채워보자
		Moyang m1 = new Moyang();
		Moyang m2 = new Moyang();
		Moyang m3 = new Moyang();

		// 각각의 힙에 올려져있는 인스턴스의 변수에 데이터를 채워보자
		m1.figure = "최신형";
		m2.figure = "중고형";
		m3.figure = "징역형";

		// 각 객체에 저장되어있는 변수의 내용을 출력해보자.
		/*System.out.println("m1.figur : " + m1.figure);
				System.out.println("m2.figur : " + m2.figure);
				System.out.println("m3.figur : " + m3.figure);
		 */
		mo1 = m1;
		mo2 = m2;
		mo3 = m3;
	}
	
	// 전역변수의 내용을 출력
	public void toPrint() {
		System.out.println("mo1.figur : " + mo1.figure);
		System.out.println("mo2.figur : " + mo2.figure);
		System.out.println("mo3.figur : " + mo3.figure);
	}
	
	public static void main(String[] args) {
		new Test02();
		
	}

}
