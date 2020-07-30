package day02;

public class Test16 {
	public static void main(String[] args) {
		
		double data = 365.2426;
		int tmp = (int)data;
		
		double days = tmp;
		   tmp -= data;
		   
		// tmp를 초단위로 변환시킨다
		int total = (int)(tmp * 24 * 3600);
		   
		// 시간을 계산하자
		int hour = total / 3600;
		total %= 3600;
		  
		//분을 계산
		int min = total / 60;
		total %= 60;
		   
		//초
		int sec = total;
		   
		System.out.printf("일년 %0.4f일은\n\t%3d일, %2d시간, %2d분, %d초 입니다.",data, days, hour, min, sec); 
		   		
	}
}
