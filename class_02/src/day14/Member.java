package day14;

public class Member {
//	private String cName;
//	public String getcName() {
//		return cName; // 두글자 이상의 단어가 결합된 경우는 getter Setter가 지정해주는 대로 그냥 쓰면 된다.
//	}
//	public void setcName(String cName) {
//		this.cName = cName;
//	}
	private int mno, avatarNo; // 회원번호 기억할 변수
	private String name, id, pw, mail, tel, addr, birth; // 이름, 아이디, 비번, 메일, 전번, 주소, 생일
	private char gen; // 성별
	
	public int getMno() {
		return mno;
	}
	public void setMno(int mno) {
		this.mno = mno;
	}
	public int getAvatarNo() {
		return avatarNo;
	}
	public void setAvatarNo(int avatarNo) {
		this.avatarNo = avatarNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	public char getGen() {
		return gen;
	}
	public void setGen(char gen) {
		this.gen = gen;
	}
}
