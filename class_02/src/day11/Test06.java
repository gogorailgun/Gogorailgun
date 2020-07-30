package day11;

/*
  	문제 1]
  		친구 이름을 출력하면 친구의 정보를 나열하는 프로그램을 만드세요.
 */
import java.util.*;

public class Test06 {
	Person[] friend;
	String[] name, tel, mail,gen;
	int[] age;

	
	public Test06() {
		//setOne();
		setMany(); // 배열이 초기화됐다.
		toPrint();
	}
	
	// 1단계 - 한 사람의 데이터를 만들어보자. 출력까지 해보자.
	public void setOne() {
		// 객체 만들고
		Person p1 = new Person();
		// 데이터 초기화하고
		p1.setData("홍길동", "010-1111-1111","hong@increpas.com", 16, "남자");
		
		// 객체에서 변수 접근해서 출력해본다.
		System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %2d\n성    별 :%2c",
							p1.name ,p1.tel,p1.mail,p1.age, p1.gen
							);
		
	}
	//전역 변수의 데이터를 초기화해주는 함수
	public void setArray() {
		name = new String[] {"아이유","윤요셉","윤병욱","오혜찬","이지우"};
		tel = new String[] {"010-1111-1111","010-5069-8600","010-2587-2304",
											"010-7648-5213","010-33843-4798"};
		mail = new String[] {"iu@increpas.com","jpseph@increpas.com","wook@increpas.com",
										"chan@increpas.com","jiwoo@increpas.com"};
		age = new int[] {27,33,29,28,26};
		gen = new String[] {"여자","남자","남자","남자","남자"};
	}
	
	
	//다수의 친구정보를 저장해보자.
	public void setMany() {
		//데이터 배열 초기화 해주고
		setArray();
		//친구 배열 초기화 해주고 ==> 데이터 기억할 공간만 확보한 상태가 된다.
		friend = new Person[name.length];
		
		// 친구 배열에 데이터 채워주고
		for(int i = 0; i < friend.length; i++) {
			// 확보한 공간에 한개씩 인스턴스 채워주고
			friend[i] = new Person();
			
			// 인스턴스의 변수에 데이터를 채워주고
			/*
			friend[i].name = name[i];
			friend[i].tel = tel[i];
			friend[i].mail = mail[i];
			friend[i].age = age[i];
			friend[i].gen = gen[i];
			*/
			
			friend[i].setData(name[i], tel[i], mail[i], age[i], gen[i]);
		}
	}
	
	// 친구들 정보를 출력해주는 함수
	public void toPrint() {
		for(int i =0; i< friend.length; i++) {
			System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %2d\n성    별 :%2s\n",
					friend[i].name ,friend[i].tel,friend[i].mail,friend[i].age, friend[i].gen);
			System.out.println("------------------------------------------");
		}
	}
	
	public void Who() {
		Scanner sc = new Scanner(System.in);
		System.out.println("친구 이름을 입력하세요! :");
		String Fname = sc.next();
		
	//	if(Fname.equals(friend[i].name)) {
		//	System.out.printf("", )
	//	}
	}
	
	public static void main(String[] args) {
		new Test06();
		
	}

}

class Person {
	String name, tel, mail,gen;
	int age;
	
	public void setData(String name, String tel, String mail, int age, String gen) {
		this.name = name;
		this.tel = tel;
		this.mail = mail;
		this.age = age;
		this.gen = gen;
	}
}