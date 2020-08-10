package day18;

import javax.swing.*;
/*
 	학생의
 		java, oracle, web, jsp, total
 	성적을 관리할 클래스를 작성하세요.
 	
 	단, 클래스를 출력하면
 	"???? 학생의 성적 : java - xxx, oracle - xxx, web - xxx, jsp - xxx, total - xxx"
 	의 형식으로 출력되게 하세요.
 	
 	 2. 학생이름이 같으면 같은 학생으로 처리되게 하세요.
 	 equals 함수 오버라이드
 	 
 */


public class Ex03 {

	public Ex03() {
		
		// 두 학생의 데이터를 입력해보자. 반복해서 처리할 것이므로 배열로 만들어서 처리하자.
		Stud[] stud = new Stud[2];
		
		for(int i = 0; i < stud.length; i++) {
			String name = JOptionPane.showInputDialog("이름을 입력하세요");
			
			// 같은 이름이 발생하면 예외가 발생하게 처리
			try {
				if(i != 0 && name.equals(stud[i-1].name)) {
					throw new Exception();
				}
			} catch(Exception e) {
				i--;
				JOptionPane.showMessageDialog(null, "같은 학생이 입력되었습니다.");
			}
			
			
			//과목 점수를 만든다
			
			int[] score = new int[4];
			for(int j = 0; j < 4 ; j++) {
				score[j] = (int)(Math.random()*41+60);
				
			}
			stud[i] = new Stud(name, score[0] , score[1], score[2], score[3]);
		}
		
		
		// 꺼내서 확인해보자.
		String msg = stud[0].name.equals(stud[1].name) ? "같은" : "다른";
		JOptionPane.showMessageDialog(null, "두 학생은 " + msg + " 학생입니다.\n" + stud[0] + "\n" + stud[1]);
		
		
			
		/*
		int[] java = new int[5] ;
		int[] oracle = new int[5];
		int[] web = new int[5];
		int[] jsp = new int[5];
		int[] total = new int[5];
		
		String[] names = {"안철수","오영희","홍길동","안철수","고둘리"};
		int[][] students = new int[5][5];
		
		for(int i = 0; i < java.length; i++) {
			java[i] = (int)(Math.random()*70+31);
			oracle[i] = (int)(Math.random()*70+31);
			web[i] = (int)(Math.random()*70+31);
			jsp[i] = (int)(Math.random()*70+31);
			total[i] = java[i] + oracle[i] + web[i] + jsp[i];
			
			students[i][0] = java[i];
			students[i][1] = oracle[i];
			students[i][2] = web[i];
			students[i][3] = jsp[i];
			students[i][4] = total[i];
		}
		
		for(int j = 0; j < students.length; j++) {
			System.out.printf("%3s 학생의 성적 : java - %2d, oracle - %2d, web - %2d, jsp - %2d, total - %3d\n",names[j],
					students[j][0],students[j][1],students[j][2],students[j][3],students[j][4]);
			for(int k = 0; k < students.length; k++) {
				
				if(names[j].equals(names[k])) {
					continue;
				}
			}
			
		}
		*/
		
	}



	public static void main(String[] args) {
		new Ex03();
	}

}

class Stud{
	
	String name;
	int java,oracle,web,jsp,total;
	
	public Stud() {}
	public Stud(String name, int java, int oracle, int web, int jsp) {
		this.name = name;
		this.java = java;
		this.oracle = oracle;
		this.web = web;
		this.jsp = jsp;
		SetTotal();
	}
	
	public void SetTotal() {
		total = java + oracle + web + jsp;
	}
	
	
	public String toString() {
		return name + "학생의 성적 : java - " + java + ", oracle - " + oracle + ", web - "+ web + ", jsp - "+jsp+ ", total - "+total;
	}
	
	@Override
	public boolean equals(Object o) {
		return name.equals(((Stud) o).name); // 문자열 비교는 == 로 절대 비교하지 말것.... 반드시 equals() 함수로 처리할 것...
		
		
	}
}