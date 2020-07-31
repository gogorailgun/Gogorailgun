package day12;

import javax.swing.*;

public class Test02 {


	public Test02() { // 기본 생성자 함수.
		Member m = new Member(); // 메모리에 먼저 올리고
		Member[] memb = m.getMember(); // 배열 만들고
		
		// 한사람 데이터만 출력한다. ( 예 : 야스오 )
		m.toPrint("야스오", memb);
		
		// 모든 사람의 정보를 출력해보자.
		/*
		for(int i = 0 ; i < memb.length ; i++ ) {
			memb[i].toPrint();
		}
		 */
	
	
	m.toPrint(memb);
	System.out.println();
	
	// 회원번호를 입력받는다.
		String sno = JOptionPane.showInputDialog("회원번호를 입력하세요!");
		// 정수 데이터로 변환해주고
		int mno = Integer.parseInt(sno);
		
		// 출력해주고
		m.toPrint(mno, memb);
	
	}
	

	

		
		
	public static void main(String[] args) {
		new Test02();
	}
}

//회원 한명의 데이터를 저장할 클래스
class Member{
	int mno;
	String id, name, mail, tel;
	char gen;
	
	
	
	// 5명의 회원을 저장할 배열을 반환해주는 함수
	public Member[] getMember() {
		Member[] mArr = new Member[5]; // 데이터를 기억할 공간만 만들어놓은 상태
		
		String[] names = getNames();
		String[] ids = getIds();
		String[] mails = getMails();
		String[] tels = getTels();
		char[] gens= getGens();
		
	
		// 회원번호는 1001번부터 순차적으로 증가시켜서 만들어 주는 것으로 한다.
		
		
		for(int i = 0; i < getNames().length ; i++) {
			mArr[i] = new Member(); // 데이터를 기억할 각 공간에 반복해서 만들어서 넣어준다.
			//회원 번호 입력
			mArr[i].mno = 1001+i;
			// 회원 이름 입력
			mArr[i].name = names[i];
			mArr[i].id = ids[i];
			mArr[i].mail = mails[i];
			mArr[i].tel = tels[i];
			mArr[i].mail = mails[i];
			mArr[i].gen = gens[i];
		}
		
		return mArr;
	}
	
	// 길이를 입력하면 회원 배열을 반환해주는 함수
	public Member[] getMember(int len) {
		Member[] mArr = new Member[len];
		
		return mArr;
	}
	
	// 회원 이름 배열을 반환해주는 함수
	public String[] getNames() {
		String[] names = {"야스오","쉬바나","릴리아","징크스","빅토르"};
		return names;
	}
	
	// 회원 전화번호들을 배열로 반환해주는 함수
	public String[] getTels() {
		return new String[] {"010-1111-1111","010-2222-2222",
							"010-3333-3333","010-4444-4444",
							"010-5555-5555"};
	}
	
	public String[] getMails() {
		return new String[] {"mungwa@increpas.com","Dragon@increpas.com","nothekarim@increpas.com",
				"ineedINF@increpas.com","jaunscintist@increpas.com"};
	}
	
	// 회원 성별을 배열로 반환해주는 함수
	public char[] getGens() {
		return new char[] {'M','F','F','F','M'};
	}
	
	public String[] getIds() {
		return new String[] {"Science", "no1jungle","mylittlepony","crazypentakil","fatherBlitz"};
	}
	
	// 회원들 정보를 출력해주는 함수
	public void toPrint() {
		System.out.println("*******************************");
		System.out.println("-------- " + name +" 님 정보 -------");
		System.out.println("-------------------------------");
		System.out.printf("회원번호 : %5d\n이    름 : %3s\n아 이 디 : %-15s\n전화번호 : %13s\n이 메 일 : %-25s\n성    별 : %2s\n", 
				mno, name, id, tel, mail, gen == 'M' ? "남자" : "여자");
		System.out.println("===============================");
	}
	
	
	
	
	
	// 회원 이름을 입력하면 회원 정보를 출력해주는 함수
	public void toPrint(String name, Member[] memb) {
		for(int i = 0 ; i < memb.length ; i++) {
			if(name.equals(memb[i].name)) {
				System.out.println("******************************************");
				System.out.println("--------------"+name+"님정보---------------");
				System.out.printf("회원번호 : %4d\n이    름 : %3s \n아 이 디 : %-15s\n전화번호 : %13s\n이 메 일 : %-25s\n성    별 :%2s\n",
						memb[i].mno, memb[i].name, memb[i].id, memb[i].tel, memb[i].mail, memb[i].gen);
				System.out.println("============================================");
			}
		}
	}
	
	// 회원 정보를 출력해주는 함수
	public void toPrint(Member[] memb) {
		for(int i = 0; i < memb.length ; i++) {
			Member m = memb[i];
			m.toPrint();
		}
}
		/*
		System.out.println("-------------------------------------------");
		System.out.println("--------------"+name+"님정보---------------");
		System.out.printf("회원번호 : %4d\n이    름 : %3s \n아 이 디 : %-15s\n전화번호 : %13s\n이 메 일 : %-25s\n성    별 :%2s\n",
				mno, name, id, tel, mail, gen);
		System.out.println("------------------------------------------");
		*/
		
	// 회원 번호를 입력하면 해당 회원의 정보를 출력해주는 함수
		public void toPrint(int mno, Member[] memb) {
			for(int i = 0 ; i < memb.length ; i++ ) {
				if(memb[i].mno == mno) {
					memb[i].toPrint();
				}
			
		}
	}
}

