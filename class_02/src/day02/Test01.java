package day02;

/**
 * 이 주석은 api 배포에 포함되는 내용을 기술하는 방법
 * 
 * @author class02
 * @since 2020.01.17
 * @version 1.0
 **/
 
public class Test01 {
	public static void main(String[] args) {
		System.out.println("여기는 Test01");
	}
	
	public void abc() {
		System.out.println("이것은 abc함수");
	}
	
	public String xyz() {
		return "이것은 xyz함수";
	}
}

class Test01_01 {
	public static void main(String[] args) {
		System.out.println("여기는 Test01_01");
	}
}

/*
 * public class Test01_02{ public static void main(String[] args) {
 * System.out.println("여기는 Test01_02"); } } /*
 * 
 * /* 자바의 주석 표현 방법 // - 한줄만 주석으로 처리하는 방법
 * 
 */

/*
 * 이 주석은 여러 행을 주석으로 처리하는 방법 드래그 후 단축키 Ctrl+shift+/ 주석처리 해제 방법 Ctrl + shift +
 * \(backslash)
 */
