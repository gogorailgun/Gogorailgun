package day12;

import javax.swing.JOptionPane;

/*
  	
  	1. 노래 한곡을 저장할 클래스를 정의하고
  		곡명, 가수, 작곡가, 재생시간(문자열)
  	   앨범 한장에(12곡) 을 저장할 배열을 만들고
  	   내용을 출력하는 프로그램을 작성하세요.

  	2. 곡 명을 입력하면 해당 곡의 정보를 출력하도록 하세요.

 */
public class Ex01 {

	public Ex01() {
		Album no1 = new Album(); // Album을 메모리에 올린다.
		Album[] album = no1.getAlbum(); // album 배열을 만든다.
		
		//앨범에 모든 곡의 정보를 출력
		for(int i = 0; i < album.length; i++) {
			album[i].toPrint();
		}
		
		// 곡명을를 입력받는다
		String sno = JOptionPane.showInputDialog("곡명을 입력하세요!");
		
		
		// 출력해주고
		no1.toPrint(sno, album);
	}
	
	public static void main(String[] args) {
		new Ex01();

	}

}

//노래 한곡을 저장할 클래스
class Album{
	int track;
	String songName, songwriter, Lyrics, runtTime;
	
	public Album[] getAlbum() {
		Album[] mArr = new Album[12];
		
		int[] tracks = getTrack();
		String[] songNames = getSongName();
		String[] songwriters = getSongwriter();
		String[] Lyricss = getLyrics();
		String[] runtTime = getRuntTime();
	
		
		for(int i = 0; i < getTrack().length ; i++) {
			mArr[i] = new Album();
			
			mArr[i].track = tracks[i];
			mArr[i].songName = songNames[i];
			mArr[i].songwriter = songwriters[i];
			mArr[i].Lyrics = Lyricss[i];
			mArr[i].runtTime = runtTime[i];
			
		}
		
		return mArr;
	}
	
	
	
	public int[] getTrack() {
		return new int[] {1,2,3,4,5,6,7,8,9,10,11,12};
	}
	
	public String[] getSongName() {
		return new String[] {"비밀", "잠자는 숲속의 왕자", "별을 찾는 아이",
					"너랑 나", "벽지무늬", "삼촌", "사랑니","Everything's Alright",
					"Last Fantasy","Teacher","길 잃은 강아지","4AM"};
	}
	
	public String[] getSongwriter() {
		return new String[] {"정석원","윤상","김광진","이민수","윤종신,이근호","이적","G.고릴라",
				"김현철","김형석","Ra.D","아이유","Corinne Bailey Rae, Rod Bowkett"};
	}
	
	public String[] getLyrics() {
		return new String[] {"김이나","박창학","허승경","김이나","윤종신","이적, 아이유",
							"G.고릴라, 아이유","김현철, 아이유","김이나","Ra.D, 아이유",
							"아이유","아이유"};
	}
	
	public String[] getRuntTime() {
		return new String[] {"4:04","3:34","3:58","3:58","3:40","3:24",
							"3:33","3:33","6:07","Ra.D","4:01",
							"3:14","3:02"};
	}
	
	public void toPrint() {
		System.out.println("★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★★");
		System.out.println("-------------"+songName+"의 곡정보---------------");
		System.out.println("---------------------------------------------");
		System.out.printf("트랙번호 : %2d\n노래제목 : %-26s\n작 곡 가 : %-26s \n"
				+ "작 사 가 : %-26s \n재생시간 : %4s\n", track, songName, songwriter, Lyrics, runtTime );
		System.out.println("=============================================");
	}
	
	// 앨범 정보를 출력해주는 함수
	public void toPrint(Album[] album) {
		for(int i = 0; i < album.length ; i++) {
			Album m = album[i];
			m.toPrint();
		}
	}	
	
	public void toPrint(String songName, Album[] album) {
		for(int i = 0; i < album.length; i++) {
			if((album[i].songName).equals(songName)) {
				album[i].toPrint();
			}
		}
	}
	
}