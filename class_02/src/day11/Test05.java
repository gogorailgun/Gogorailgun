package day11;

import java.util.Arrays;

public class Test05 {
	
	public Test05(){
		// 네모 데이터 5개를 가지는 배열을 만들고 출력하세요
		
		// 1. 배열부터 만든다
		Nemo[] nemo = new Nemo[5];
		
		/*     이렇게 쓰기 귀찮으니 반복문으로 만든다
		nemo[0] = new Nemo();
		nemo[1] = new Nemo();
		nemo[2] = new Nemo();
		nemo[3] = new Nemo();
		nemo[4] = new Nemo();
		*/
		
		for(int i = 0; i < nemo.length; i++) {
			nemo[i] = new Nemo();
			
			// 객체가 만들어지면 변수를 초기화해준다.
			int garo = (int)(Math.random()*16+5);
			int sero = (int)(Math.random()*16+5);
			nemo[i].setNemo(garo, sero);
		}
		/*
		for(int i = 0; i < nemo.length; i++) {
			int garo = (int)(Math.random()*16+5);
			int sero = (int)(Math.random()*16+5);
			nemo[i].setNemo(garo, sero);

		}
		*/
		
		
		// 각 방에 있는 네모의 면적을 출력해보자.
		/*
		System.out.println(nemo[0].area);
		System.out.println(nemo[1].area);
		System.out.println(nemo[2].area);
		System.out.println(nemo[3].area);
		System.out.println(nemo[4].area);
		*/
		int i = 1;
		for(Nemo n : nemo) {
			System.out.println(i++ +"번째의 네모의 가로 ㅣ " + n.garo +" | 세로 :"+
										n.sero + " | 넓이: "+ n.area);
		}
		
	}
		
	public static void main(String[] args) {
		new Test05();

	}

}

class Nemo {
	int garo, sero, area;
	
	// 내보내주는 데이터가 없기 때문에(return 값이 없고) 직접 데이터를 집어넣기 때문에 타입이 void
	public void setNemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		area = garo * sero;
	}
	
	
}