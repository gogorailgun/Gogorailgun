package day24.ex;

/*
 	Test04파일을 받아와서
 	Test04.txt 파일을 만들어라
 */
import java.io.*;
import java.util.*;

public class Ex01 {

	public Ex01() {
		
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			fin = new FileInputStream("src/day24/Test04.java");
			fout = new FileOutputStream("src/day24/Test04.txt");
			
			byte[] buff = new byte[1024];
			int i = 0;
			
			while(true) {
				//  배열 초기화
				Arrays.fill(buff, (byte)0);
				
				int len = fin.read(buff);
				
				if(len == -1) {
					// 읽은 데이터가 없을때
					break;
				}
				String str = new String(buff);
				
				fout.write(buff, 0, len);
				
				System.out.println("파일 저장 완료");
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fin.close();
				fout.close();
				
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
