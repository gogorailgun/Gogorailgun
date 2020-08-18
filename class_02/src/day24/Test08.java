package day24;

/*
 	내용을 파일에 저장하는 프로그램을 만드세요.
 	단, Buffered 스트림을 사용해서 처리하세요.
 */
import java.io.*;

import javax.swing.JOptionPane;

public class Test08 {

	public Test08() {
		// 타겟 스트림(기본 스트림)은 반드시 필요하다
		FileOutputStream fout = null;
		// 필요에 따라서 보조(필터) 스트림을 연결할 수 있다. 이때 스트림의 방향도 맞춰야 한다.
		BufferedOutputStream bout = null;
		
		try {
			fout = new FileOutputStream("src/day24/wTest/BufferedTest.txt");			
			bout = new BufferedOutputStream(fout);
			
			// 내용을 적당히 만들자
			
			String str = "나라의 말이 중국과 달라" + "/r/n" +
					"서로 통하지 않으므로/r/n" + 
					"이런 까닭으로 어리석은 백성들이/r/n" 
					+ "말하고자 하는 바가 있어도/r/n" 
					+ "끝내 제 뜻을 펴지 못하는 사람이 많다.";
			byte[] buff = str.getBytes();
			
			bout.write(buff);
			/*
				문제는 아직 버퍼가 다 채워지지 않았으므로
				버퍼의 내용이 FileOutputStream으로 가지 않는다.
				따라서 아직 저장이 되지 않았다.
			
				따라서 반드시 습관적으로 작업이 완료되는 시점에서 
				버퍼를 비워주는 습관을 가진다.
			 */
			bout.flush();
			
			JOptionPane.showMessageDialog(null, "파일 저장완료");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				bout.close();
			} catch(Exception e) {
				
			}
		}
		
	}

	public static void main(String[] args) {
		new Test08();
	}

}
