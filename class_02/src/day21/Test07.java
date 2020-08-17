package day21;
/*
 	랜덤하게 10~50 사이의 반지름을 가지는 Circle을
 	ArrayList에 10개를 채우고
 	출력하고
 	정렬하고
 	출력하세요
 */
import java.util.*;

public class Test07 {

	public Test07() {
		// Arraylist 준비
		ArrayList list = new ArrayList();
		// List에 Circle을 10개 채운다.
		
		for(int i = 0; i < 10; i++) {
			Circle won = getWon();
			list.add(won);
		}
		System.out.println("1. 정렬 전");
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 정렬한다
		// 지금처럼 정렬 기준이 없거나 정렬 기준을 바꿔야 할 경우는 
		// Comporator 을 만들어서 Collection.sort(List l, Comporator c)
		// 로 정렬한다.
		
		Collections.sort(list, new Mysort1());
		System.out.println("2. 정렬 후");
		for(Object o : list) {
			System.out.println(o);
		}
		
		// 내림차순 정렬한다.
		Collections.reverse(list);
		System.out.println("3. 내림차순 정렬 후");
		for(Object o : list) {
			System.out.println(o);
		}
		/*
		// 전역 내부클래스 이용방법.
		Collections.sort(list, new Mysort2());
		 */
		
		// 무명 내부 클래스를 이용하는 방법
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Circle c1 = (Circle)o1;
				Circle c2 = (Circle)o2;
				double result = c1.getArea() - c2.getArea();
				
				return result > 0 ? 1 : -1;
			}
			
		});
	}
	
	
	
	public Circle getWon() {
		// 원 클래스 불러오고
		Circle won = new Circle();
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
		new Test07();
	}

}
