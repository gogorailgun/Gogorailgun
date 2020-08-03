package day12;

/*
  	문제 2]
  		1. 
	  		java, oracle, html, jsp, total 점수를 기억할 클래스를 만들고
	  		학생 한명의 데이터를 입력해서 출력하세요.
	  		
	  		점수는 70~95 점 사이로 랜덤생성해서 입력하세요.
	  		
  		2.
	  		생성자 함수를 오버로딩해서
	  		4과목 점수를 입력해서 객체가 만들어지게 하세요.
	  		출력함수도 만드는 것으로 한다.
	  		
  		3. 
  			3명 데이터를 관리할 배열을 만들어서 입력하고
  			출력하세요. 
 */

public class Ex02 {

	public Ex02() {
		//setOne();
		setThree();
	}
	
	public static void main(String[] args) {
		new Ex02();
		
	}
	
		
	// 한명의 데이터 만들고 출력하기
	public void setOne() {
		int java = (int)(Math.random()*26+70);
		int oracle = (int)(Math.random()*26+70);
		int html = (int)(Math.random()*26+70);
		int jsp = (int)(Math.random()*26+70);
		
		Stud student = new Stud(java,oracle,html,jsp);
		
		System.out.println(student);
		// 클래스의 주소를 호출하게 되면 자동으로 toString함수를 호출하게 된다.
	}

	// 3명의 데이터를 만들고 출력해보자.
	public void setThree() {
		// 세명의 점수가 필요하므로 배열로 만들어 처리한다.
		Stud[] students = new Stud[3]; // 방만 3개 만듬
		
		for(int i = 0; i < students.length; i++) {
			
			int java = (int)(Math.random()*26+70);
			int oracle = (int)(Math.random()*26+70);
			int html = (int)(Math.random()*26+70);
			int jsp = (int)(Math.random()*26+70);
			
			students[i] = new Stud(java, oracle, html, jsp);
		}
		
		// 출력한다
	
		for(Stud st : students) {
			System.out.println(st);
		}
	}
}
