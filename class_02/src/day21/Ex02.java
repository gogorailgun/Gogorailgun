package day21;
/*
 	가로와 세로가 랜덤하게 만들어진 사각형을 10개를 만들어서
 	ArrayList에 담고
 	내용을 출력하고
 	
 	면적을 기준으로 정렬하고
 	출력하고
 	
 	가로를 기준으로 정렬하고
 	출력하고
 	
 	세로를 기준으로 정렬하고
 	출력하고
 */

import java.util.*;

class Ex02 {

	public Ex02() {
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Square nemo = getSquare();
			list.add(nemo);
		}
		
		System.out.println("정렬 전");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list);
		System.out.println("넓이순 정렬 후");
		System.out.println("-----------------------------------------");
		
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 무명 내부 클래스를 이용해 가로 정렬
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Square s1 = (Square) o1;
				Square s2 = (Square) o2;
				int result = s1.getGaro() - s2.getGaro();
				return result > 0 ? 1 : -1;
			}
			
		});
		
		// 무명 내부클래스를 사용해서 가로 정렬
		System.out.println("가로 정렬 후");
		System.out.println("-----------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		
		Collections.sort(list, new Comparator() {

			@Override
			public int compare(Object o1, Object o2) {
				Square s1 = (Square) o1;
				Square s2 = (Square) o2;
				int result = s1.getSero() - s2.getSero();
				return result > 0 ? 1 : -1;
			}
			
		});
		
		// 무명 이너클래스를 사용해서 세로 정렬
		System.out.println("세로 정렬 후");
		System.out.println("-----------------------------------------");
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public Square getSquare() {
		Square nemo = new Square();
		int garo = (int)(Math.random()*31+10);
		int sero = (int)(Math.random()*31+10);
		
		nemo.setGaro(garo);	
		nemo.setSero(sero);
		nemo.setArea();		
		return nemo;
	}
	
	
	
	public static void main(String[] args) {
		new Ex02();
	}

}
