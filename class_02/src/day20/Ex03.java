package day20;
/*
 	1.
 		Vector 를 만들고
 		이름, 자바, 디비, 웹, jsp, 총점을 저장해서
 		출력하세요.
 		
 	2. 3명을 출력하세요
 */
import java.util.*;

public class Ex03 {

	public Ex03() {
		Vector name = new Vector();
		name.add("홍길동");
		name.add("고길동");
		name.add("노길동");
		
		Vector student = new Vector();
		
		for(int k = 0 ; k < name.size() ; k++ ) {
			Vector v = new Vector();
			v.add(name.get(k));
//			v.add("홍길동");
			v.add(10);
			v.add(10);
			v.add(10);
			v.add(10);
			v.add(0);
		//  System.out.println(v.get(5));
			
		//v.set(5, (int)v.get(1) +(int)v.get(2) +(int)v.get(3) +(int)v.get(4));
			for(int i = 1; i < 5; i++) {
				v.set(5, (int)v.get(5) + (int)v.get(i));
			}
			
			System.out.println(v.get(5));
			
			
			for(int i = 0; i < 6; i++) {
				int no = (int)(Math.random()*100+1);
				if(i == 5) {
					v.set(5, (int)v.get(1) +(int)v.get(2) +(int)v.get(3) +(int)v.get(4));
					System.out.print(v.get(i));
					break;
				}
				v.set(i+1, no);
				System.out.print(v.get(i)+ ", ");
			}
			System.out.println();
			
			// student Vector 에 v 추가...
			student.add(v);
			
		}
		
		// 출력
		for(Object o : student) {
			System.out.println(o);
		}
		
	}

	public static void main(String[] args) {
		new Ex03();
	}

}