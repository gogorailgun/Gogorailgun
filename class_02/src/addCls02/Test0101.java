package addCls02;

import java.net.*;
import java.io.*;

public class Test0101 {
	
	Socket socket;

	public Test0101() {
		try {
			socket = new Socket("192.168.0.57", 7777);
			/*
			 	소켓이 만들어 지면
			 	상대방과 연결이 된 상태가 된다.
			 	실제로 연결만 됐고 메세지를 보낸것은 아니다.
			 	accept 함수를 while문으로 계속 반복하는 이유는
			 	accept 함수가 끝나면 서버와의 연결을 종료하는 것이기 때문에
			 	와일문으로 계속해서 실행시켜주고 있어야 한다.
			 */
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();
			
			InputStreamReader tmp = new InputStreamReader(in);
			BufferedReader br = new BufferedReader(tmp);
			
			PrintWriter pw = new PrintWriter(out);
			
			pw.println("나 통신할래...!");
			pw.flush();
			
			String msg = br.readLine(); // BufferedReader 안에 담겨있는 메세지를 msg에 담는다.
			
			System.out.println("받은내용 : " + msg);
			
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			
		}
	}

	public static void main(String[] args) {
		new Test0101();
	}

}
