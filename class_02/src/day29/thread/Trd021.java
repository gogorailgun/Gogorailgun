package day29.thread;

public class Trd021 implements Runnable {

	@Override
	public void run() {
		display();
	}
	
	public void display() {
		for(int i = 0; i < 1000; i++) {
			System.out.println("반장이 밥을 사줌 - "+ (i + 1));
		}
	}

}
