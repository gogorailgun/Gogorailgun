package day25;

import java.io.*;
/*
 	day25/docu/fileTest02.txt 파일을 읽어서 - 바이트기반 - 연결스트림 - 문자기반 - 보조스트림
 	파일을 복사하는데
 		fileTest03.txt
 	을 만드는데
 	PrintReader 를 사용해서 처리해보자.
 */

public class Test08 {

	public Test08() {
		// 바이트기반 타겟 스트림 준비
		FileInputStream fin = null;
		// 연결 스트림
		InputStreamReader ir = null;
		// 문자 기반 필터스트림
		BufferedReader br = null;
		// 보조 스트림
		PrintWriter pw = null;
		
		try {
			// 타겟 스트림 만들고
			fin = new FileInputStream("src/day25/docu/fileTest01.txt");
			// 연결 스트림 만들고
			ir = new InputStreamReader(fin);
			// 보조 스트림 만들고
			br = new BufferedReader(ir);
			// 출력 스트림 만들고
			pw = new PrintWriter("src/day25/docu/fileTest03.txt");
			while(true) {
				// 읽고
				String line = br.readLine();
				if(line == null) break;
				// 쓰고
				pw.println(line);
				// buffer 비우고
				pw.flush();
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pw.close();
				br.close();
				ir.close();
				fin.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test08();
	}

}
