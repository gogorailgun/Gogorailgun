package day02;

public class Test09 {
	public static void main(String[] args) {
		int no1 = 10;
		int no2 = 11;
		boolean result = (no2==no1); 
		
		++no1; // no1 : 11
		no2--; // no2 : 11

		if( (no1++ > no2--) && (++no1 > no2)) {
			System.out.println("no1 : " + no1);
			System.out.println("no2 : " + no2);
		}

		/*
		System.out.println("no1 : " + no1); // no1 : 11
		System.out.println("no2 : " + no2); // no2 : 10
		System.out.println("no1 = no2 \t" + result);
		*/

	}
	
}
