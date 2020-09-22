package day29.thread;

public class Trd062 implements Runnable {

	@Override
	public void run() {
		for(int i = 0; i < 100; i++) {
			System.out.println("영선씨가 아마존주식 사줍니다. - " + (i + 1));
			// 한번 춘ㄹ력하면 비록 시간이 남았지만
			// 이번에는 야예 Bloack 상태로 보낸다
			
			try {
				Thread.sleep(300);
			} catch(Exception e) {}
			
		}
	}
}
