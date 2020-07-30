package day02;

public class Test11 {
	public static void main(String[] args) {
		int no1 = 10;
		no1 += 10; // no1 = no1 + 10 << 한번더 쓰기 귀찮아서 +=를 만듬
		System.out.println("no1 : " + no1);
		
		no1 -= 2; // no1 = no1 -2;
		System.out.println("no1 : " + no1);
		
		no1 /= 3; // no1 = no1 / 3;
		System.out.println("no1 : " + no1);
		
		no1 *= 4; // no1 = no1 * 4;
		System.out.println("no1 : " + no1);
		
		no1 %= 5; // no1 = no1 %5;
		System.out.println("no1 : " + no1);
		
	}
}
