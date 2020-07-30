package day11;

/*
 	문제 2]
  		1. 세모 한개를 만들고 데이터를 출력하기.
  		
  		2.
  		세모 데이터 5개를 관리하는 배열을 만들고
  		각 인스턴스의 변수를 초기화해서
  		내용을 출력하세요.
*/


public class Ex01 {

	public Ex01() {
		setSemo();
	}
	
	
	public void oneSemo() {
		Semo[] semo = new Semo[1];

		for(int i = 0 ; i < semo.length; i++) {
			semo[i] = new Semo();
			int width = (int)(Math.random()*21+5);
			int height = (int)(Math.random()*21+5);
			semo[i].setData(width, height);

		}
		for(Semo s : semo) {
			System.out.println("삼각형의 밑변 : "+ s.width+ "\n높이 : " + s.height+ "\n넓이 : "+ s.area + "입니다.");
		}
	}
	

	
	
	
	public void setSemo() {
		// 세모타입 데이터를 갖는 배열을 생성
		Semo[] semo = new Semo[5];

		// 반복문으로 값 넣어주기
		for(int i = 0; i < semo.length; i++) {
			semo[i] = new Semo();

			// width, height 변수를 초기화.
			int width = (int)(Math.random()*21+5);
			int height = (int)(Math.random()*21+5);
			semo[i].setData(width, height);
		}
		
		int i = 1;
		for(Semo s : semo) {
			System.out.println(i++ + "번째 삼각형의 밑변 : "+ s.width+ "\n높이 : " +
							s.height+ "\n넓이 : "+ s.area + "입니다.");
			System.out.println("--------------------------------------------");
		}
	}
	
	
	public static void main(String[] args) {
		new Ex01();

	}

}

class Semo{
	// 세모 클래스 안에 높이, 길이, 넓이 인스턴스변수를 선언해준다.
	int width, height;
	double area;
	
	void setData(int width, int height) {
		this.width = width;
		this.height = height;
		area = (int)(width * height / 2.0 * 100 + 0.5) / 100.0;
	}
}