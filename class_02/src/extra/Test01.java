package extra;

import java.util.*;

public class Test01 {

	public Test01() {
		Object o = "abcd";
		System.out.println(o.equals("abcd"));
		
		Comparator c1 = new MyComp01();
		System.out.println(c1.compare("abc", "ab"));
		
		Comparator[] cArr = new Comparator[3];
		cArr[0] = new MyComp01();
		cArr[1] = new MyComp02();
		cArr[2] = new MyComp03();
		
		for(int i = 0; i < cArr.length; i++ ) {
			System.out.println((cArr[i].compare("abc", "dfg")));
		}
		
	}
	
	public static void main(String[] args) {
		new Test01();
	}

}

class MyComp01 implements Comparator{


	public int compare(Object o1, Object o2) {
		return 100;
	}
	
}
class MyComp02 implements Comparator{
	
	public int compare(Object o1, Object o2) {
		return 200;
	}
	
}
class MyComp03 implements Comparator{
	
	public int compare(Object o1, Object o2) {
		return 300;
	}
	
	public int compare() {
		return 300;
	}
}