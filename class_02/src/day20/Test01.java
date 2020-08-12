package day20;

import java.util.*;
public class Test01 {

	public Test01() {
		// 날짜 객체를 만든다
		Date d = new Date();
		// 현재 시간을 출력한다
		for(int i = 0; i < 3; i++) {
			System.out.println((d.getYear()+1900)+"년"+(d.getMonth()+1)+"월 "+d.getDate() + "일 " +getYoil(d.getDay())+" " +d.getHours()+":" + d.getMinutes() +":" + d.getSeconds());
			
			/*
			  	자바는 시간을 1900년 1월 1일 0시 0분 0초 를 기준으로
			  	밀리초 단위로 기억을 한다.
			  		
			  		예 ]
			  			1901년 1월 1일 0시 0분 0초는
			  				365*24*3600+ 0.000
			  			의 데이터가 기억된다.
			  			
			  			1900년 1월 1일 0시 1분 1촌는
			  				61.000
			  			이라는 데이터로 내부적으로 기억된다.
			  		
			  	따라서 현재 2020년은 120년으로 기억한다.
			  	그래서 정확한 년도를 얻기 원하면 1900을 더해줘야 한다.
			  	
			  	getMonth() 함수의 반환값은
			  	0월부터 11월까지 반환해준다.
			  	따라서 정확한 월은 +1을 해줘야 한다.
			  
			  	getDay()
			  	요일을 반환해주는 함수인데
			  	반환값이 0~6까지의 정수를 반환해준다.
			  	
			  		0: 일요일
			  		1: 월요일
			  			...
			  		5: 금요일
			  		6: 토요일
			 */
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
	}
	
	// 요일을 문자열로 반환해주는 함수
	public String getYoil(int day) {
		String yoil = "일요일";
		switch(day) {
		case 0: 
			yoil = "일요일";
			break;
		case 1: 
			yoil = "월요일";
			break;
		case 2: 
			yoil = "화요일";
			break;
		case 3: 
			yoil = "수요일";
			break;
		case 4: 
			yoil = "목요일";
			break;
		case 5: 
			yoil = "금요일";
			break;
		case 6: 
			yoil = "토요일";
			break;
		}
		return yoil;
	}

	public static void main(String[] args) {
		new Test01();
	}

}
