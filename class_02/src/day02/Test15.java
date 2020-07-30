package day02;

public class Test15 {
	public static void main(String[] args) {
		int money = 74232;
		int tmp = 50000;
		
		
		int man5 = money / tmp;
		tmp = money % tmp;
		
		System.out.println("필요한 5만원권 " + man5);
		
		int man1 = tmp/ 10000;
		tmp %= 10000;
		
		System.out.println("필요한 만원권 "+man1);
		
		int cheon5 = tmp / 5000;
		tmp %= 5000;
		
		System.out.println("필요한 오천원권 " +cheon5);
		
		int cheon = tmp / 1000;
		tmp %= 1000;
		
		System.out.println("필요한 천원권 " + cheon);
		
		int beck5 = tmp / 500;
		tmp %= 500;
		System.out.println("필요한 오백원 " + beck5);
		
		int beck = tmp / 100;
		tmp %= 100;
		System.out.println("필요한 백원 " + beck);
		
		int sip = tmp / 10;
		tmp %= 10;
		System.out.println("필요한 십원 " + sip);
		System.out.println(tmp);
		
		
		
/*		
		System.out.println("필요한 5만원권은" + (money / 50000) + "개 입니다.");
		System.out.println("필요한 1만원권은" + (money /10000) + "개 입니다.");
		System.out.println("필요한 5천원권은" + (money /5000)+ "개 입니다.");
		System.out.println("필요한 천원권은" + (money /50000) + "개 입니다.");
		System.out.println("필요한 오백원은" + (money /500) + "개 입니다.");
		System.out.println("필요한 백원은" + (money /100) + "개 입니다.");
		System.out.println("필요한 십원은" + (money /10) + "개 입니다.");
*/
		}
}
