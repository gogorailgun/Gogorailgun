package day19;

import java.util.*;

public class Test06 {

	public Test06() {
		String sarr = "[1,2,3,4,5]";
		//sarr = sarr.replaceAll(",", " | ");
		System.out.println(sarr);
		
		sarr.substring(sarr.indexOf("[") +1, sarr.indexOf("]"));
		
		StringTokenizer token1 = new StringTokenizer(sarr,",");
		int len = token1.countTokens();
		
		int[] sArr = new int[len];
		
		for(int i = 0; token1.hasMoreTokens(); i++) {
			String sno = token1.nextToken();
			int no = 0;
			
			try {
				no = Integer.parseInt(sno);
			} catch(Exception e) {
				e.printStackTrace();
			}
			sArr[i] = no;
		}
		
		
		for(int no : sArr) {
			System.out.printf("%2d, ", no);
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
