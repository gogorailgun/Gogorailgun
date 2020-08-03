package day12;

public class Song {

	String SongName;
	String singer;
	String songWriter;
	String runTime; // 00:00:00
	
	public Song() {
		// 생성자함수는 클래스이름과 동일한 이름을 사용
		// 반환값이 존재하면 절대로 안된다
		
		// 모든 노래는 블랙핑크의 불장난으로 셋팅이 되게 한다.
		SongName = "불장난";
		singer = "Black Pink";
		songWriter = "Teddy";
		runTime = "03:28:14";
	}
	
	
	// 기본 생성자 함수를 오버로딩한다.
	// 노래가 가지는 기본 정보를 가지고 객체를 만들도록
	public Song(String SongName, String singer, String songWriter, String runTime) {
		this.SongName = SongName;
		this.singer = singer;
		this.songWriter = songWriter;
		this.runTime = runTime;
	}
	
	// 곡의 정보를 출력하는 전담 처리 함수
	public void toPrint() {
		System.out.printf("%-25s - %25s - %25s - %8s - \n", SongName, singer, songWriter, runTime);
	}

}

