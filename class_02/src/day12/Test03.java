package day12;

public class Test03 {
	
	public Test03() {
		String[] name = {"윤요셉", "유병욱","오혜찬"};
		int[] age = {18,17,16};
		
		//Saram 3개를 저장할 배열을 만들고
		Saram[] mans = new Saram[name.length]; // Saram 클래스의 데이터를 입력할 공간만 확보한 상태
		
		// 데이터 채워주고
		for(int i = 0; i < mans.length; i++) {
			mans[i] = new Saram();
			
			//데이터의 맴버변수 초기화해주고
			mans[i].name = name[i];
			mans[i].age = age[i];
		}
		
		// Saram 클래스 내에 맴버변수의 내용을 출력하는 함수를 만들어뒀으니
		// 그 함수는 자신의 정보를 출력하는 함수이고
		// 따라서 그 함수만 호출해주면 모든 사람의 정보가 출력이 된다.
		for(int i = 0 ; i < mans.length ; i++) {
			mans[mans.length - 1 - i].toprint();
		}
		
		Saram s1 = mans[0];
		System.out.println("세명중 첫번째 사람은 "+ s1.getName() + " 입니다");
		
		
		
		
	}
	
	public static void main(String[] args) {
		new Test03();

	}
	
	public void forTest() {
		Saram s1 = new Saram();
		Saram s2 = new Saram();
		Saram s3 = new Saram();
		Saram s4 = new Saram();
		Saram s5 = new Saram();
		
		Saram[] saram = {s1 , s2, s3, s4, s5};
	}
}

class Saram {
	String name;
	int age;
	
	public String getName() {
		return name;
	}
	
	public void toprint() { // 이름과 나이를 입력해주는 햄수
		System.out.println(name + " - "+ age);
	}
}