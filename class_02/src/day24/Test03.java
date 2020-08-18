package day24;

import java.io.*;

/*
	수업설명 문서가 있는 폴더 내의 파일 목록을 알아내자.
 */
public class Test03 {

	public Test03() {
		// 목록을 알아내고 싶은 폴더를 파일로 만든다.
		File file = new File("C:\\Users\\class02\\git\\gogorailgun\\class_02\\doc");
		/*
		// 이름 목록을 알아낸다.
		String[] fList = file.list();
		// 출력...
		for(String fName : fList) {
			System.out.println(fName);
		}
		*/
		
		
		// 이름과 정보도 같이 리스트로 꺼내오는 방법
		File[] fList = file.listFiles();
		for(File f : fList) {
			File fInfo = f;
			String fName = fInfo.getName(); // 파일 이름 꺼내기
			long len = fInfo.length(); 		// 파일 크기 꺼내기
			// 출력한다.
			System.out.println(fName + " - " + len + " byte");
		}
		
		
		/*
		// 확장자가 pdf인것만 골라서 정보를 출력해보자.
		File[] fList = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				/*	
					매개변수의 역할
						File dir		- 현재 파일의 정보를 알려준다.
						String name 	- 현재 파일의 이름을 알려준다.
						
					우리는 확장자가 .pdf로 끝나는 파일만 보기를 원한다
					
					그런데 이 함수(accept())는 자동 호출되는 함수이다.
				*/
		/*
			if(name.endsWith("pdf")) {
				return true;
			}
				return false;
			}
		});
		*/
		
		
		// 문제 ] Java01.pdf, Java02.pdf, Java03.pdf, Java04.pdf, Java05.pdf
		
		File[] jList = file.listFiles(new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {
				String tmp = name.substring(4, name.indexOf('.'));
				boolean ck1 = false;
				for(int i = 0; i < tmp.length(); i++) {
					char ch = tmp.charAt(i);
					if(ch >= '0' && ch <= '9') {
						ck1 = true;
					} else {
						ck1 = false;
					}
				}
				
				if(name.startsWith("java") && ck1 && name.endsWith("pdf")) {
					return true;
				}else {
					return false;					
				}
			}
			
		});
		
		
				
		
	}

	public static void main(String[] args) {
		new Test03();
	}

}
