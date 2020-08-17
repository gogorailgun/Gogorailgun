package day21;

import java.util.*;

public class Mysort1 implements Comparator {

	@Override
	// 외부에서 데이터를 객관적으로 비교하는 함수.
	public int compare(Object o1, Object o2) {
		Circle c1 = (Circle)o1;
		Circle c2 = (Circle)o2;
		double result = c1.getArea() - c2.getArea();
		
		return result > 0 ? 1 : -1;
	}
	
}
