package day13;

import java.util.HashSet;
import java.util.Iterator;

public class Test00 {

	public static void main(String[] args) {
		HashSet set = new HashSet();
		set.add("abcd");
		set.add("bcd");
		set.add("cd");
		set.add("dabc");
		set.add("abcd");
		
		Iterator itor = set.iterator();
		int i = 0;
		while(itor.hasNext()) {
			System.out.println(i++);
			System.out.println((String) itor.next());
			System.out.println((String) itor.next());
		}
	}

}
