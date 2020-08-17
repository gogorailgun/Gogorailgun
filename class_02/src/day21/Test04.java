package day21;

import java.util.*;

/*
  	1 ~ 10 사이의 숫자를 랜덤하게 만들어서
  	10개를 ArrayList 담고
  	출력하고
  	정렬하고
  	출력해보자.
 */


public class Test04 {

	public Test04() {
		viewList();
	}
	
	// ArrayList 만들고 출력해주는 함수
	public void viewList() {
		// 1. ArrayList를 준비한다.
		ArrayList list = new ArrayList();
		// 2. 랜덤하게 숫자를 만들고 담는다.
		for(int i = 0; i < 10; i ++) {
			// 숫자 만들고
			int no = (int)(Math.random()*10 +1);
			// 리스트에 담고
			list.add(no);
		}
		// 3. 출력하고
		for(Object o : list) {
			System.out.printf((int)o + " | ");
		}
		// 4. 정렬하고
		Collections.sort(list);
		// 5. 출력하고
		System.out.println();
		for(Object o : list) {
			System.out.printf((int)o + " | ");
		}
		System.out.println("# 정렬 후 출력");
		
		
		// 내림차순 정렬을 해보자.
		System.out.println("# 내림차순 정렬 후 출력");
		Collections.reverse(list);
		for(Object o : list) {
			System.out.printf((int)o + " | ");
		}
		System.out.println();
		
	}
	
	public static void main(String[] args) {
		new Test04();
	}

}
