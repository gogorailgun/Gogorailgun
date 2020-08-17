package day21;

/*
 	랜덤하게 10 ~ 50 사이의 반지름을 가지는 원을
 	ArrayList에 10개를 채우고
 	출력하고
 	정렬하고
 	출력하세요
 */
import java.util.*;

public class Test06 {

	public Test06() {
		// ArrayList 만들기
		ArrayList list = new ArrayList();
		// list에 원 10개 채우기
		for(int i = 0; i < 10; i++) {
			Won won = getWon();
			list.add(won);
		}
		
		System.out.println("정렬 전 출력");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		System.out.println("정렬 후 출력");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}

	public Won getWon() {
		// 원 클래스 불러오고
		Won won = new Won();
		// 반지름 넣고
		int rad = (int)(Math.random()*41+10);
		// 반지름 둘레 넓이 채워주고
		won.setRad(rad);
		won.setArround();
		won.setArea();
		
		// 반환하고
		return won;
		
	}
	
	public static void main(String[] args) {
		new Test06();
	}

}
