package day16;

public class Test05 {
	public Test05() {
		xyz(new Ifc() { // 상속받은 클래스를 새롭게 정의하는 방법.
						// 
			@Override	
			public void abc() {
				System.out.println("Cls01");
			}
		});
	}
	public static void main(String[] args) {
		new Test05();
	}
	
	public void xyz(Ifc i) {
		i.abc();
	}

}

interface Ifc{
	void abc();
}
/*
class Cls01 implements Ifc{
	public void abc() {
		System.out.println("Cls01");
	}
}
*/