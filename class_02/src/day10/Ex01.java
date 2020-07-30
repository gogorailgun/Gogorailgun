package day10;

/*
 	반지름을 입력받아서
 	원의 넓이와 둘레를 계산하고
 	출력하는 프로그래믈 작성하세요.
 	단, 입력, 넓이계산, 둘레계산, 출력은 함수를 만들어서 처리하세요.
 	
 	(int)(no *100 + 0.5) *0.01
 */
import javax.swing.*;
public class Ex01 {
	
	
	double R;
	double PI = 3.14;
	
	public Ex01() {
		display();
		double Carea = area();
		Carea = (int)(Carea*100 + 0.5)*0.01;
		double Cround = round();
		Cround = (int)(Cround*100 + 0.5)*0.01;
		JOptionPane.showMessageDialog(null,"반지름이 "+ R + "인 원의 넓이는 : "+ Carea + "둘레는 : " + Cround +"입니다.");
	}
	
	public void display() {
		int no1 =Integer.parseInt(JOptionPane.showInputDialog(null, "반지름을 입력해 주세요."));
		R = no1;
	}
	
	public double area() {
		return (PI*R*R); 
	}
	
	public double round() {
		return (R*2+PI);
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}
