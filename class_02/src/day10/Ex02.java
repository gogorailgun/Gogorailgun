package day10;

/*
 	문제 2]
 	
 		1차 배열에 4과목의 점수를 입력한 후
 		총점과 평균을 구하는 프로그램을 작성하세요.
 		
 		단, 입력, 총점계산, 평균계산, 출력은 함수를 작성해서 처리하세요.
 */
import javax.swing.*;

public class Ex02 {

	int[] kor = new int[4];
	int[] eng = new int[4];
	int[] math = new int[4];
	int[] science = new int[4];
	int[] total = new int[4];
	int[] average = new int[4];
	
	
	

	public Ex02() {
		Grade();
		output();
		
	}
	
	public void Grade() {
		
		for(int i = 0; i < kor.length; i++) {
			int no1 = Integer.parseInt(JOptionPane.showInputDialog(null, "국어점수를 입력하세요"));
			kor[i] = no1;
			
			int no2 = Integer.parseInt(JOptionPane.showInputDialog(null, "영어점수를 입력하세요"));
			eng[i] = no2;
			
			int no3 = Integer.parseInt(JOptionPane.showInputDialog(null, "수학점수를 입력하세요"));
			math[i] = no3;
			
			int no4 = Integer.parseInt(JOptionPane.showInputDialog(null, "과학점수를 입력하세요"));
			science[i] = no4;
			
			total[i] = kor[i] + eng[i] + math[i] + science[i];
			average[i] = total[i]/total.length;
			
		}	
	}
	
	public void output() {
		for(int i = 0; i < total.length; i++) {
			JOptionPane.showMessageDialog(null, (i+1)+"번 학생의 성적은" + "\n국어: " + kor[i] + "점 영어: " +eng[i]+ "점 수학: " + math[i] + "점 과학: " + science[i]
											+ "\n총점: " + total[i] + " 점 평균: " + average[i] + " 점입니다."  );
		}
	}
	
	
	public static void main(String[] args) {
		new Ex02();

	}

}
