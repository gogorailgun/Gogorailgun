package day12;

public class Test06 {

	public Test06() {
		// 이름 2개를 입력하고 출력
		toPrint("윤요셉","유병욱");
		System.out.println();
	
		// 다섯명의 이름을 입력하고 출력
		toPrint("아이유","조이","유병재","조충현","해도리");
	
	}
	
	
	public static void main(String[] args) {
		new Test06();
	}
	
	// 회운의 이름들을 입력하면 출력해주는 함수를 작성하자.
	public void toPrint(String...name) {
		// 문자열들을 입력해주면 배열로 변환해서 처리해준다.
		for(String irum : name) {
			System.out.println(irum);
		}
	}
	/*
	public void toPrint(String[] name) {
	// 반드시 배열으 ㅣ형태로 만들어서 함수를 호출해야한다.
		for(String irum : name) {
			System.out.println(irum);
		}
	}
	 */
}
