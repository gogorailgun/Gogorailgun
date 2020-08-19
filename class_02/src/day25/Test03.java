package day25;

import java.io.*;

/*
 	문자단위로 파일에 데이터를 저장하는 프로그램을 작성해보자.
 */

public class Test03 {

	public Test03() {
		FileWriter fw = null;
		
		try {
			//스트림 만들고
			fw = new FileWriter("src/day25/docu/fileTest01.txt");
			/*
			// 1. 한글자(2바이트) 만 저장해 보자.
			char ch = '안';
			fw.write(ch);
			*/
			
			/*
			// 2. 여러글자를 저장해보자.
			String str = "바라봤을 뿐인 얼굴\r\n" + 
					"떠오르지 않나요? 네.\r\n" + 
					"꺼림칙한 건 나인데\r\n" + 
					"\r\n" + 
					"신경 쓰이잖아요?\r\n" + 
					"희미해져 가는 게\r\n" + 
					"사라져 없어져 버린다는 게\r\n" + 
					"\r\n" + 
					"망설임은 항상 내 편\r\n" + 
					"물어 볼 수조차 없죠\r\n" + 
					"\r\n" + 
					"대체 어디로들 가는 건 지 몰라\r\n" + 
					"\r\n" + 
					"인생 마지막의 숨을 든 채로\r\n" + 
					"몸을 던져 버리잖아\r\n" + 
					"\r\n" + 
					"색 바랜 기록 위에 눈물 닿아도\r\n" + 
					"빛은 돌아오지 않아\r\n" + 
					"\r\n" + 
					"구겨진 기억만을 안고 살고 싶다면\r\n" + 
					"누구에게 말해야만 해?\r\n" + 
					"\r\n" + 
					"가장 바라고 가장 두려운 것은\r\n" + 
					"마음의 저편에\r\n" + 
					"\r\n" + 
					"두고 온 나인데 어느새 손에 쥐어져\r\n" + 
					"거짓말처럼 아 아미타"+
					"\r\n" + 
					"(그래요 그래요 좋아요 좋아요 나예요 나예요)\r\n" + 
					"바라지 않는 거라도 좋아\r\n" + 
					"(그래요 그래요 좋아요 좋아요 나예요 나예요)\r\n" + 
					"두려워도 괜찮을 거라고\r\n" + 
					"\r\n" + 
					"(위로하는 그 소리) 거짓말\r\n" + 
					"(뻔한 엔딩 그 스토리)\r\n" + 
					"\r\n" + 
					"타임라인 저 아득히 아래 쌓여버리겠지";
			char[] chArr = str.toCharArray();
			fw.write(chArr);
			
			*/
			// 3. 문자열을 저장해보자.
			String str = "사촌간볼빨기는 여러가지면에서 한국 대중음악계에 새로운 바람을 몰고온 존재라고 할 수 있다.";
			fw.write(str);
		} catch(Exception e){
			e.printStackTrace();
		} finally {
			try {
				fw.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
