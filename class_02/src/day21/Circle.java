package day21;

public class Circle {
	private int rad; // 반지름 기억할 변수
	private double arround; // 둘레
	private double area; // 넓이 기억할 변수
	// 접근지정자가 이 클래스 내에서만 접근하도록 되어있으므로
	// 데이터를 꺼내고 기억시키는 기능의 함수를 구현해야한다.
	public int getRad() {
		return rad;
	}
	public void setRad(int rad) {
		this.rad = rad;
	}
	public double getArround() {
		return arround;
	}
	public void setArround() {
		this.arround = 2 * rad * Math.PI;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = rad * rad * Math.PI;
	}
	@Override
	public String toString() {
		// 우리가 만드는 모든 클래스는 Object 클래스를 상속 받아서 만드는 클래스가 되므로
		// 당연히 
		
		return "Circle : rad = " + rad + ", arround = " + arround + ", area = " + area ;
	}
	
	
	
}
