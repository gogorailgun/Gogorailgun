package day13;

public class Test08 {
	public Test08() {
		/*
		Square nemo1 = new Square(5);
		Rectangle nemo2 = new Rectangle(10, 5);
		nemo1.toPrint();
		nemo2.toPrint();
		Nemo n1 = nemo1;
		Nemo n2 = nemo2;
		n1.toPrint();
		n2.toPrint();
		
		Nemo[] nArr = {n1, n2};
		
		for(int i = 0 ; i < nArr.length ; i++ ) {
			nArr[i].toPrint();
		}
		 */
		
		/*
		 	문제 1 ]
		 		
		 		0 ~ 10 사이의 수를 랜덤하게 10개를 발생시켜서
		 		홀수가 나오면 정사각형(Square), 
		 		짝수가 나오면 사각형 (Rectangle)
		 		사이즈는 3 ~ 15 까지 랜덤하게...
		 		을 만들어서 Nemo 타입의 배열에 입력하고
		 		하나씩 꺼내서 출력하세요.
		 */
		// 0~10까지 랜덤한 숫자
		int num1 = (int)(Math.random()*11);
		
		Nemo[] nArr = new Nemo[10]; // 방 만드는 선언
		
		for(int i = 0; i<10; i++) {
			
			int num = (int)(Math.random()*11);
				
			if(num%2 == 0) { // 홀수인경우 정사각형을 만들어서 넣어준다.
				int num2 = (int)(Math.random()*13 + 3); // 3~15
				int num3 = (int)(Math.random()*13 + 3);
				
				Rectangle Jiksagak = new Rectangle(num2,num3);
				nArr[i] = Jiksagak;
			} else { // 짝수인 경우고 직사각형을 만들어서 넣어주면 된다
				int num3 = (int)(Math.random()*13 + 3);
				Square Jeongsagak = new Square(num3); 
				nArr[i] = Jeongsagak;
			}
			
		}
		
		for(int i = 0 ; i < nArr.length ; i++ ) {
			nArr[i].toPrint();
		}
		
	
	}
	public static void main(String[] args) {
		new Test08();
	}

}

class Nemo {
	public void toPrint() {
		System.out.println("이것은 네모입니다.");
	}
}

class Square extends Nemo { // 정사각형
	int size;
	int area;
	
	public Square() {}
	public Square(int size) {
		this.size = size;
		area = size * size;
	}
	
	// toPrint() 오버라이딩한다.(재정의한다.)
	public void toPrint() {
		System.out.printf("이 사각형은 가로와 세로가 %4d 이고, 넓이가 %8d 인 정사각형입니다.\n", 
							size, area
						);
	}
}

class Rectangle extends Nemo { // 직사각형
	int width;
	int height;
	int area;
	
	public Rectangle() {}
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		area = width * height;
	}
	
	// toPrint() 오버라이딩한다.(재정의한다.)
	public void toPrint() {
		System.out.printf("이 사각형은 가로가 %4d 이고, 세로가 %4d 이고 넓이가 %8d 인 사각형입니다.\n", 
				width, height, area
				);
	}
}