package addCls02;

import java.io.*;
import java.net.*;

import javax.swing.JOptionPane;

public class Test01 {
/*
 	네트워크
 		HTTP
 		TCP/IP
 			접속형 통신 ex) 채팅같이 항상 연결되어 있는 경우
 			
 			두개의 프로그램이 필요하다.
 			서로 접속을 해주어야 하기 때문이다.
 			이중에서 접속을 요청하는 프로그램 - 클라이언트
 			접속을 허용하는 프로그램 - 서버
 			
 			서버 프로그램
 				ServerSocket - 요청을 받는 전화
 				
 				만드는 방법]
 					ServerSocket(int port)
 				각기 다른 포트로 받아줘야 한다.
 			
 			클라이언트 프로그램
				Socket 	     - 요청을 하는 전화
			
			accpet 함수는 서버와 클라이언트를 연결해주는 함수이고
			블록 함수의 특징을 가져 접속을 받기 전까지 계속해서 돌아가고 있는 함수이다.
			다음 라인이 오기 전까지 계속해서 대기하고 있는것.
			
 --------------------------------------------------------------------------------------
 		UDP
 			비접속형 통신 ex) 일방적으로 한쪽으로 보낼 수 있는 경우
 */
	
	ServerSocket server; // 서버 소켓 만듬
	Socket socket; // 일반소켓 만듬
	public Test01() {
		try {
			server = new ServerSocket(7777);
			System.out.println("#### 서버 준비 완료 ####");
			socket = server.accept(); // server에서 accpet함수로 호출
			System.out.println("#### 통신 준비 완료 ####");
			
			/*
			 	회선이 연결되면
			 	메세지를 주고받을 주닙가 되었고
			 	그 회선에서 메세지를 주고받을 도구를 꺼내와야 한다.
			 */
			
			InputStream in = socket.getInputStream(); // <<바이트기반 소켓에 넣을 준비를 한다.
			OutputStream out = socket.getOutputStream(); // 소켓에 실어 내용을 내보낼 준비를 한다
			PrintWriter pw = new PrintWriter(out);  // 메세지를 아웃풋 스트림으로 내보내준다.

			InputStreamReader tmp = new InputStreamReader(in); // 문자기반을 바이트로 변환해주는 함수
			BufferedReader br = new BufferedReader(tmp); //  <<문자기반
			
			String msg = br.readLine();
			
			msg = JOptionPane.showInputDialog("받은 메세지 : " + msg + "\n메세지 입력!");
			
			pw.println(msg);
			pw.flush();
			
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
		//	System.out.println("#### 통신 종료 ####");
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
