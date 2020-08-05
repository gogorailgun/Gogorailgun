package day15;

import java.util.Arrays;

/*
  		문제 2]
  			Dohyung 인터페이스를 구현한
  			Sagak
  			Samgak
  			Won
  			클래스를 구현하고
  			
  			랜덤하게 0 ~ 15까지 숫자를 발생시켜서
  			3으로 나눈 나머지가 0이면 Won
  			1이면 Samgak
  			2이면 Sagak
  			을 만들고
  			
  			Dohyong 배열에 10개 채우고
  			출력하세요.
 */

public class Test07 {
	public Test07() {
		
		Dohyung[] arr = new Dohyung[10];
		for(int i = 0; i < 10 ; i++ ) {
			
		int no1 = (int)(Math.random()*16);
		int no2 = (int)(Math.random()*16);
		
		Samgak tri = new Samgak(no1, no2);
		Sagak squr = new Sagak(no1, no2);
		Won circ  = new Won(no1);
		
		
			
			int num = (int)(Math.random()*16);
			
			switch(num%3) {
			
			case 0:
				//tri.toPrint();
				arr[i] = tri;
				break;
				
			case 1:
				//squr.toPrint();
				arr[i] = squr;
				break;
				
			case 2:
				arr[i] = circ;
				//circ.toPrint();
				break;
			
			}
			
				
		}
		for(int i = 0; i< arr.length; i++) {
			arr[i].toPrint();
		}
		
	}

	public static void main(String[] args) {
		new Test07();
	}

}

class Sagak implements Dohyung{

	int width, height;
	double area;
	
	public Sagak() {}
	public Sagak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}
	
	@Override
	public void setArea() {
		area = width * height;
	}

	@Override
	public void toPrint() {
		System.out.println("사각형의 밑변은 : " +width+ " 높이는 : " + height + " 넓이는 : " + area);
	}
	
}

class Samgak implements Dohyung{
	
	int width, height;
	double area;
	
	public Samgak(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
	}

	@Override
	public void setArea() {
		area = width * height / 2;
	}
	
	@Override
	public void toPrint() {
		System.out.println("삼각형의 밑변은 : " +width+ " 높이는 : " + height + " 넓이는 : " + area);
	}
}

class Won implements Dohyung{
	
	int rad;
	double arround, area;
	
	
	public Won() {}
	public Won(int rad) {
		this.rad = rad;
		setArround();
		setArea();
	}
	
	@Override
	public void setArea() {
		area = (int)(rad * rad * Math.PI*100)/100.0;
	}
	
	public void setArround() {
		arround = (int)(2 * rad * Math.PI*100)/100.0;  
	}
	
	@Override
	public void toPrint() {
		System.out.println("원의 반지름은 : " +rad+ " 둘레는 :" + arround + " 넓이는 : " + area);
	}
}