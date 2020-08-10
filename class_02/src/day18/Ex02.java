package day18;

/*
 	 삼각형 클래스를 만드는데
 	 삼각형의 밑변이 같으면 같은 삼각형이 되도록 정의하고
 	 밑변, 높이를 1~20 사이의 정수로 랜덤하게 만들어서
 	 삼각형 두개를 만들고
 	 만들어진 삼각형들을 비교해서
 	 같은지 여부를 출력하세요
 	 
 	 단, 3보다 작은 숫자가 발생하면 사용자 정의 예외를 만들어서 처리하세요
 	 15보다 큰 숫자는 NumberFormatException 으로 처리하세요.
 */


public class Ex02 {

	public Ex02() {
		
		int no1 = (int)(Math.random()*20+1);
		int no2 = (int)(Math.random()*20+1);
		int no3 = (int)(Math.random()*20+1);
		int no4 = (int)(Math.random()*20+1);
		
		if(no1 == no3) {
			no4 = no2;
		}
		
		try {
			if(no1 < 3 || no2 < 3 || no3 < 3 || no4 < 3) {
				throw new ExcptEx02();
			} else if(no1 > 15 || no2 > 15 || no3 > 15 || no4 > 15) {
				throw new NumberFormatException();
			}
			
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch (ExcptEx02 e) {
			System.out.println(e.toString());
		}
		
		Semo s1 = new Semo(no1, no2);
		Semo s2 = new Semo(no3, no4);
		String msg = "밑변 높이가 각각 " + no1 +", " + no2 + " 그리고 " + no3 + ", " + no4 + "인 두 삼각형은" +
				(s1.equals(s2) ? " 같은 " : " 다른 ") + "삼각형입니다.";
		System.out.println(msg);
		
	}

	public static void main(String[] args) {
		new Ex02();
	}

}

class Semo{
	int width, height;
	double area;
	public Semo(){
		
		}
	
	public Semo(int width, int height) {
		this.width = width;
		this.height = height;
		setArea();
		
	}
	
	public void setArea() {
		area = width * height / 2;
	}
	
	public void setArea(int width, int height) {
		area = width * height;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		
		Semo s = (Semo) o;
		if(this.area == s.area) {
			bool = true;
		}
		return bool;
	}
}

class ExcptEx02 extends Exception{
	public String toString() {
		String s = getClass().getName();
		String message = "15 이상의 숫자입니다.";
		return (message != null) ? (s + ":" + message) : s;
	}
}