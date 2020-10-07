package addCls02;

import java.net.*;

public class Udp01 {
	DatagramSocket socket;
	DatagramSocket dIn;
	DatagramPacket pack; // 데이터 보내기
	DatagramPacket inPack; // 데이터 받기
	
	/*
	  	DatagramSocket 만드는 방법
	  	
	  		DatagramSocket(int port) ---- 데이터를 받기위해 만드는 소켓
	  		DatagramSocket() 		----- 데이터 보내는 소켓
	 */
	
	public Udp01() {
		RThread t = new RThread();
		t.start();
		
		try {
			Thread.sleep(3000);
			sendProc();
		} catch(Exception e) {}
		
	}
	// 쪽지 보내기 함수
	public void sendProc(){
		try {
			socket = new DatagramSocket();
			
			String msg = "나에게 보내는 메세지";
			
			byte[] buff = msg.getBytes(); // 바이트 배열로 반환해주는 함수.
			
			InetAddress inet = InetAddress.getByName("192.168.0.57");
			
			// 배열길이만큼 배열을 inet으로 8888번 포트로 보낸다.
			pack = new DatagramPacket(buff, buff.length, inet, 8888);
			
			// 이제 데이터가 준비됐으니 흘려보낸다
			socket.send(pack);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		new Udp01();
	}
	
	class RThread extends Thread{
		byte[] buff = new byte[10240]; // 데이터가 byte 배열로 넘어오기 때문에 byte 배열을 저장할 buff를 만든다. 
		
		public void run() {
			try {
				dIn = new DatagramSocket(8888);
				inPack = new DatagramPacket(buff, 10240);

				dIn.receive(inPack);

				byte[] data = inPack.getData();

				String msg = new String(data);

				System.out.println("받은 메세지 : " + msg);
			} catch(Exception e) {
				e.printStackTrace();
			}

		}
	}
}
