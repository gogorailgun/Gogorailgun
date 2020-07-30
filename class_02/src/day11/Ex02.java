package day11;

/*
   		복습 문제]
   		
   			친구 한명의 데이터를 기억할 클래스를 정의하고
   			
   			친구 세명의 데이터를 기억해서
   			출력하는 프로그램을 작성하세요. 
   			
   			1. 회원 한명의 데이터를 입력해서 출력하세요
   			
   			2. 회원 다섯명의 데이터를 입력하고 출력하는 프로그램을 작성하세요
   			
   			3. 회원아이디를 입력하면 회원 정보를 출력해주는 프로그램을 작성하세요.
 */

import java.util.*;

public class Ex02 {
	Scanner sc = new Scanner(System.in);
	
	Member[] member;
	String[] name, email, sex, tel;
	int[] age;
	
	public Ex02() {
		setMember();
		totalMember();
		toPrint();
	}
	
	public void setOne(){
		
		
		
		// f1이라는 객체를 만드는데 Member를 참조한다.
		Member f1 = new Member();
		
		//입력부 생성
		System.out.print("이름을 입력해 주세요 : ");
		f1.name = sc.next();
		System.out.print("이메일을 입력해 주세요 : ");
		f1.email = sc.next();
		System.out.print("나이를 입력해 주세요 :");
		f1.age = Integer.parseInt(sc.next());
		System.out.print("성별을 입력해 주세요 :");
		f1.sex = sc.next();
		System.out.print("전화번호를 입력해 주세요 :");
		f1.tel = sc.next();
		
		// 초기화 해준다.
		//f1.memData("김인직","ingik@increpas.com",32,"남자","010-4885-8253");
		System.out.println("=================================================");
		System.out.printf("이    름 : %3s\n이 메 일 : %-25s\n나    이 : %2d \n성    별 : %2s \n전화번호 : %-13s"
						, f1.name, f1.email, f1.age, f1.sex, f1.tel);
		//출력해준다.
	}
	
	
	public void setMember() {
				
		name = new String[5];
		email = new String[5];
		age = new int[5];
		sex = new String[5];
		tel = new String[5];
		
		for(int i = 0; i < name.length; i++){
			System.out.print("이름을 입력해 주세요 : ");
			name[i] = sc.next();
			System.out.print("이메일을 입력해 주세요 : ");
			email[i] = sc.next();
			System.out.print("나이를 입력해 주세요 :");
			age[i] = Integer.parseInt(sc.next());
			System.out.print("성별을 입력해 주세요 :");
			sex[i] = sc.next();
			System.out.print("전화번호를 입력해 주세요 :");
			tel[i] = sc.next();
		}
		
	}
	
	
	
	public void totalMember(){
		member = new Member[name.length];
		
		for(int i = 0; i < name.length; i++) {
			member[i] = new Member();
			
			member[i].setData(name[i], email[i], age[i], sex[i], tel[i]);
		}
	}
	
	public void toPrint() {
		for(int i =0; i< member.length; i++) {
			System.out.printf("이    름 : %3s\n전화번호 : %13s\n이 메 일 : %-25s\n나    이 : %2d\n성    별 :%2s\n",
					member[i].name ,member[i].tel,member[i].email,member[i].age, member[i].sex);
			System.out.println("------------------------------------------");
		}
	}
	
	
	
	public static void main(String[] args) {
		new Ex02();
		
	}

}

class Member{
	
	String name,email, sex, tel;
	int age;
	
	
	public void setData (String name, String email, int age, String sex, String tel) {		
		this.name = name;
		this.email = email;
		this.age = age;
		this.sex = sex;
		this.tel = tel;
	}
	
}