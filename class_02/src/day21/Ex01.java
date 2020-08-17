package day21;

/*
 	ArrayList에
 	밑변과 높이를 랜덤하게 만들어서 삼각형을 만들고
 	
 	그 삼각형을 10개 채우고
 	출력하고
 	넓이을 기준으로 출력하고
 	
 	밑변 기준 정렬
 	출력
 	
 	높이를 기준으로 정렬
 	출력
 */
import java.util.*;
public class Ex01 {
	
	class Asort implements Comparator{

		@Override
		public int compare(Object o1, Object o2) {
			Samgak s1 = (Samgak) o1;
			Samgak s2 = (Samgak) o2;
			double result = s1.getArea() - s2.getArea();
			return result > 0 ? 1 : -1;
		}
		
	}
	class Wsort implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			Samgak s1 = (Samgak) o1;
			Samgak s2 = (Samgak) o2;
			double result = s1.getWidth() - s2.getWidth();
			return result > 0 ? 1 : -1;
		}
		
	}
	class Hsort implements Comparator{
		
		@Override
		public int compare(Object o1, Object o2) {
			Samgak s1 = (Samgak) o1;
			Samgak s2 = (Samgak) o2;
			double result = s1.getHeight() - s2.getHeight();
			return result > 0 ? 1 : -1;
		}
		
	}
	
	
	public Ex01() {
		ArrayList list = new ArrayList();
		
		for(int i = 0; i < 10; i++) {
			Samgak semo = getSamgak();
			list.add(semo);
		}
		
		System.out.println("정렬 전");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list, new Asort());
		System.out.println("넓이순 정렬");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list, new Wsort());
		System.out.println("밑변순 정렬");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		Collections.sort(list, new Asort());
		System.out.println("높이순 정렬");
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
	
	public Samgak getSamgak() {
		Samgak semo = new Samgak();
		
		int width = (int)(Math.random()*30+10);
		int height = (int)(Math.random()*30+10);
		
		semo.setWidth(width);
		semo.setHeight(height);
		semo.setArea();
		
		return semo;
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
