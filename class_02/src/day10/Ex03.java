package day10;


/*
  	문제 3]
  	
  		5명의 학생의
  		java, oracle, html, jsp
  		점수를 입력받아서 
  		
  		총점과 석차를 구하는 프로그램을 작성하세요.
  		
  		단, 입력, 총점 계산, 석차계산, 출력은 함수를 작성해서 처리하세요.
  		
  		석차 = 정렬한 후에 맨위에 학생한테 12345
 
 		10/50/80/90 = > 한사람분 데이터   / 기준으로 자르는 함수를 쓰세요
 */
import javax.swing.*;
public class Ex03 {
	
	
	
	
	
	// 학생 배열 생성
	int student[][] = new int [5][5];
	// 과목별, 총점 배열 생성
	int java[] = new int[5];
	int oracle[] = new int[5];
	int html[] = new int[5];
	int jsp[] = new int[5];
	int total[] = new int[5];
	
	
	public Ex03() {
		grade();
	}
	
	// 점수 입력
	public void grade() {
		
		
		for(int i = 0; i < java.length; i++) {
		
				String str = JOptionPane.showInputDialog("java/oracle/html/jsp 의 형식으로 입력해 주세요!");
				//    10/20/30/40
				 //   012345678910
				int idx = str.indexOf('/');
					   
				int no1 = Integer.parseInt(str.substring(0, idx));
				java[i] = no1;
				
				int no2 = Integer.parseInt(str.substring(idx + 1 , str.indexOf('/', idx + 1)));

				idx = str.indexOf('/', idx + 1); // idx를 초기화하고 다음번 순서로 넘긴다
				oracle[i] = no2;

				int no3 = Integer.parseInt(str.substring(idx + 1 , str.indexOf('/', idx + 1)));
				idx = str.indexOf('/', idx + 1);
				html[i] = no3;
	
				int no4 = Integer.parseInt(str.substring(idx + 1));
				jsp[i] = no4;
				
				total[i] = java[i] + oracle[i] + html[i] + jsp[i];
			
			
		}
		
		// 각 과목의 점수를 student[][] 배열에 넣는다. student[0] = 1번학생을 의미
		/*
		for(int i = 0; i< student.length; i++) {
			for(int j = 0; j<student[i].length; j++) {
				
				if(j == 0) {
					student[i][j] = java[i];
				} else if(j == 1) {
					student[i][j] = oracle[i];
				} else if(j == 2) {
					student[i][j] = html[i];
				} else if(j == 3) {
					student[i][j] = jsp[i];
				} else if(j == 4) {
					student[i][j] = total[i];
				}
			} 
		}
		*/
		
		for(int i = 0; i< student.length; i++) {
			System.out.println("자바" + java[i]+ "오라클" + oracle[i]);
			
			
		}
	}
	
	public static void main(String[] args) {
		new Ex03();
	}

}
