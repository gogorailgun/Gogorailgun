package day08;

public class Test05 {
	public static void main(String[] args) {
		// 문자열 만드는 방법 1
		String str1 = "abcd";
		// 문자열 만드는 방법 2
		String str2 = new String("efgh");
		
		// a b c d e f g h
		// 0 1 2 3 4 5 6 7
		
		
		
		// 문자열 결합연산 : + 연산자를 사용하면 된다.
		String str3 = str1 + str2;
		
		// charAt
		char ch = str3.charAt(5);
		System.out.println("str3.charAt(5) : " + ch);
		
		// length()
		int len = str3.length();
		System.out.println("str3.length : "+ len);
		
		// indexOf("cde")
		int idx = str3.indexOf("cde");
		System.out.println("indexOf cde :" + idx);
		
		// indexOF("cb")
		idx = str3.indexOf("cb");
		System.out.println("indexOf cb :" + idx);
		
		// indexOF("z")
		idx = str3.indexOf("z");
		System.out.println("indexOf z :" + idx);
		
		//str3에서 "cdefgh" 추출하기
		System.out.println("str3.substring(2) :" + str3.substring(2));
		
		//str3에서 "def" 추출하기
		System.out.println("str3.substring(str3.indexOf('d'), str3.substring('f')+1)) :" + str3.substring(str3.indexOf('d'), str3.indexOf('f') + 1) );
		
		// str1 == new String("abcd");
		System.out.println("str1 == new String(\"abcd\") : " + (str1 == new String("abcd")));
		
		// str1.equals("abcd")
		System.out.println("str1.equals(\"abcd\") : " + str1.equals("abcd"));
		
	}
}
