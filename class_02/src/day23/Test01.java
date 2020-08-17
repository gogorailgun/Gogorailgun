package day23;

import java.util.*;
import java.io.*;

/*
 	Sample.txt를 읽어서 Map으로 저장해보자.
 */


public class Test01 {
	
	public Test01() {
		Properties prop = new Properties();
		/*
		 	외부 파일과 연결할 예정이다.
		 	이 작업은 이후 이어지는 IO에서 공부할 때 깊게 알아보도록 한다.
		 */
		FileInputStream fin = null;
		try {
			//fin = new FileInputStream("src/day23/sample.txt"); // 한글인코딩처리를 하지 않으면 문자가 깨져서 나온다
//			fin = new FileInputStream("src/day23/sample_ko.txt");
			fin = new FileInputStream("src/day23/tel.txt");
			/*
			 	경로는
			 	절대경로를 이용해서 사용하는것이 좋다.
			 		C:\Users\class02\git\gogorailgun\class_02\src\day23\sample.txt
			 	로 사용해도 된다.
			 	이클립스 안에 데이터를 만들면 이것은 이클립스 자신이 경로를 새롭게 정해서 처리하므로
			 	src로부터 시작하는 경로를 사용하면 된다.
			 */
			
			
			// 이제 파일의 내용을 Properties에 옮긴다.
			prop.load(fin);
			// 파일의 내용을 읽어서 Map으로 처리해 놓았다
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		// 이제부터는 HashMap에 데이터가 저장된 것처럼 사용하면 된다.
		
		String name = (String) prop.get("name");
		System.out.println("저장된 번호 : " + name);
	}

	public static void main(String[] args) {
		new Test01();
	}

}
