package day13;

/*
	문제 2]
		Figure 클래스를 만들고
			
			class Figure {
				double getArea(){
					return 0.0;
				}
				public String toString(){
					return "이것은 도형입니다.";
				}
			}
		
		
		이 클래스를 상속받아서 Sagak(사각형), Semo(삼각형), Dongle(원) 클래스를 만들어서
		각 도형의 내용을 출력하세요.
 */
public class Ex02 {
	
	public Ex02() {
		Sagak square = new Sagak(4,5);
		Semo triangle = new Semo(2,3);
		Dongle Circle = new Dongle(3);
		
		System.out.println(square);
		System.out.println(triangle);
		System.out.println(Circle);
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

class Figure{
	double getArea(){
		return 0.0;
	}
	public String toString(){
		return "이것은 도형입니다.";
	}
}

class Sagak extends Figure{
	int width, height, area;
	
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		 
	}
	double getArea(){
		
		/*
		 getArea()를 오버라이딩
		 
		  방법 ]
		  	
		  		1. 함수의원형은 유지한다. 함수의 원형 = 반환값타입 + 함수이름 + 매개변수리스트
		  		2. 접근지정자는 같ㅌ거나 넓은 방향으로 한다.
		  
		  */ 
		return width * height;
	}
	
	public String toString() {
		return "이것은 가로가 "+ width + " 세로가 " + height +" 넓이가 "+ area +"인 사각형입니다" ;
	}
	
	
}

class Semo extends Figure{
	int width, height;
	double area;
	public Semo(int width,int height) {
		this.width = width;
		this.height = height;
		area = (width * height)/2;
	}
	
	double getArea() {
		return area;
	}
	
	public String toString() {
		return "이것은 가로가 "+ width + "세로가" + height +" 넓이가 "+ area + "인 삼각형입니다" ;
	}
}

class Dongle extends Figure{
	final double PI = 3.14;
	int radius;
	double area, round;
	
	public Dongle(int raduis) {
		this.radius = raduis;
		round = 2 * PI * radius;
		area = (PI * radius * radius);
		
	}
	
	public String toString() {
		return "이것은 반지름이"+ radius + " 둘레가 " + round + "넓이가" + area + "인 원입니다";
	}
}