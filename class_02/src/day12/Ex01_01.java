package day12;

public class Ex01_01 {

	public Ex01_01() {
		Song[] album = new Song[12];
		// 이 상태는 배열의 각 방에 데이터가 채워진 것은 아니고
		// 데이터를 채울 방만 준비해놓은 상태가 된다.
		// 따라서 각 방에는 데이터를 new 시켜서 채워줘야한다.
		
		String[] SongName = {"Calling",
				"Stay Gold",
				"Boy With Luv",
				"Make It Right",
				"Dionysus",
				"IDOL",
				"Airplane pt.2",
				"FAKE LOVE",
				"Black Swan",
				"ON",
				"Lights",
				"Your eyes tell",
				"The Journey"};
		String singer = "방탄소년단";
		String songWriter = "RM";
		String[] runTime = {"00:00:30","00:03:30","00:3:41","00:03:50","00:03:30",
							"00:03:12","00:04:12","00:02:59","00:03:10","00:03:32",
							"00:03:33","00:04:01"};
		
		// 각 방에다 데이터를 채워넣는다.
		for(int i = 0; i < album.length; i++) {
			album[i] = new Song(SongName[i], singer,songWriter,runTime[i]);
		}
		
		//출력한다
		// 이미 클래스에 자신의 내용을 출력하는 기능을 구현해 놓았으므로 사용하면 된다.
		
		for(int i = 0; i < album.length; i++) {
			album[i].toPrint();
		}
		
	}
	
	public static void main(String[] args) {
		new Ex01_01();
	}

}
