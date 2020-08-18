package day24;

import java.io.*;

import javax.swing.*;

/*
 	파일에 친구의 정보를 저장해보자
 	친구의 정보는
 		이름		String
 		나이		int
 		신장		double
 		성별		char
 		전화번화	String
 		메일주소	String
 */

import java.io.*;

public class Test09 {

	public Test09() {
		FileOutputStream fout = null;
		DataOutputStream dout = null;
		
		try {
			
		String name = "안지영";
		int age = 26;
		double height = 165.0;
		char gen = 'F';
		String tel = "010-1111-1111";
		String mail = "jiyoung@increpas.com";
		
		
		fout = new FileOutputStream("src/day24/wTest/doutTest.txt");
		dout = new DataOutputStream(fout);
			
		/*
		 	DataOutputStream의 특징은
		 	Java의 데이터를 변환없이 사용할 수 있다.
		 */
		dout.writeUTF(name);
		dout.writeInt(age);
		dout.writeDouble(height);
		dout.writeChar(gen);
		dout.writeUTF(tel);
		dout.writeUTF(mail);
		
		JOptionPane.showMessageDialog(null, "친구추가완료");
		
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dout.close();
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
