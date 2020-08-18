package day24;

import java.io.*;

public class Test05 {

	public Test05() {
		//파일 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		FileOutputStream fout = null;
		
		try {
			fout = new FileOutputStream("C:\\Users\\class02\\git\\gogorailgun\\class_02\\src\\day24\\wTest\\File.txt");
			// 파일이 존재하지 않아도 자동으로 만들어준다.
			/*
			// 1. 한굴자만 입력하자.
			fout.write('T');
			*/
			
			/*
			// 2. 여러 글자를 입력하자
			String str = "죽는날까지 하늘을 우러러 한 점 부끄럼이 없기를...";
			// byte 배열로 만들고
			byte[] buff = str.getBytes();
			// 입력하고
			fout.write(buff);
			*/
			
			// 3. 문자열중 특정 부분만 저장하는 방법
			String str = "Assigns the specified byte value to each element of the specified array of bytes.";
			byte buff[] = str.getBytes();
			int startidx = str.indexOf('t');
			int len = str.length() - str.indexOf('t');
			fout.write(buff, startidx, len);
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 예외 관계와 상관 없이 무조건 실행되어야 하는 내용.
			try {
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test05();
	}

}
