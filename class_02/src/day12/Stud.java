package day12;

public class Stud {
	// 이 클래스는 학생 한명의 성적을 기억할 클래스다
	// 따라서 각 과목의 점수를 기억할 변수를 준비해준다.
	int java, oracle, html, jsp, total;
	
	// 생성자 함수를 만든다.
	// 기본 생성자 함수
	
	public Stud() {}
	
	// 네과목의 점수를 입력하면
	// 객체가 만들어지도록 하는 생성자 함수
	public Stud(int java, int oracle, int html, int jsp) {
		this.java = java;
		this.oracle = oracle;
		this.html = html;
		this.jsp = jsp;
		setTotal();
	}
	
	public void setTotal() {
		total = java + oracle + html + jsp;
	}
	
	// toString()을 오버라이딩(함수의 재정의)한다.
	public String toString() {
		//return "여기는 학생 점수...";
		// 자동으로 호출된다. 주소값 역시 String이니까.
		return "java : "+ java + "| oracle : " + oracle 
				+ " | html : "+ html + " | jsp" + jsp + " | total : " + total;
		// 원래는 Object 함수가 가지고 있는 함수인데
		// 우리가 재 정의해서 고쳐서(오버라이딩 해서) 쓴것이다.
	}
	
}
