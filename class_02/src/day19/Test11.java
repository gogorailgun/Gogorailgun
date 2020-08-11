package day19;

/*
 	 Scanner를 이용해서 파일에 저장된 내용을 읽어서 출력하자.
 */

import java.io.*;
import java.util.*;
public class Test11 {

	public Test11() {
		File file = new File("C:\\Users\\class02\\git\\gogorailgun\\class_02\\src\\day19\\Test06.java");
		
		// 스캐너 변수를 선언하고 null로 초기화 해둔다.
		Scanner sc = null;
		
		try {
			//파일 입력해서 스캐너 만들고
			sc = new Scanner(file);
			/*
			//스캐너 내용을 출력하고
			String str = sc.nextLine();
			str += sc.nextLine() + "\n";
			str += sc.nextLine() + "\n";
			*/
			
			//출력하고
			StringBuffer buff = new StringBuffer();
			while(sc.hasNext()) {
				buff.append(sc.nextLine() + "\n");
			}
			
			System.out.println("### Test06.java\n" + new String(buff));
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Test11();
	}

}
