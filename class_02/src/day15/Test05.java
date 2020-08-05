package day15;

import java.util.*;

public class Test05 {
	public Test05() {
		Calendar cal = Calendar.getInstance(); // Calendar는 추상함수기 때문에 new시켜서 못쓴다.
		System.out.println(cal.YEAR + " 년 " + cal.MONTH + " 월 " + cal.DATE + " 일");
	}
	public static void main(String[] args) {
		new Test05();
	}

}
