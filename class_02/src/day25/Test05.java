package day25;

import java.io.*;
import day24.*;


// BufferedReader를 사용해서 day24.Test01.java 파일을 읽어보자. 문자단위로 처리
public class Test05 {

	public Test05() {
		// 문자단위 타겟스트림 준비하고
		FileReader fr = null;
		// 문자단위 필터스트림 준비
		BufferedReader br = null;
		try {
			fr = new FileReader("src/day24/Test01.java");
			// 필터 스트림 만들고
			br = new BufferedReader(fr);
			// 몇번 읽어야 할지 모르므로 반복해서 처리하자.
			while(true) {
				String line = br.readLine(); // 줄바꿈 기호를 만나는 순간 읽는걸 멈춘다.
				if(line == null) {
					break;
				}
				System.out.println(line);
				/*
				  println() 함수는 출력 후 줄을 바꾸는 명령이다.
				  이미 readLine()에서 한줄 읽은 후
				  줄바꿈기호를 버렸기 때문에 줄바꾸는 기능이 필ㅇ하다.
				  <-- 자동으로 줄을 바꾸지않기 때문에 강제로 줄바꿈을 해줘야 한다.
				 
				 */
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
				fr.close();
			} catch(Exception e) {}
		}
		
		
	}

	public static void main(String[] args) {
		new Test05();
	}

}
