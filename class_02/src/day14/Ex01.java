package day14;
/*
  	10개의 데이터를 기억할 배열을 만드는데
  	1~15까지의 수를 랜덤하게 발생시키고 4로 나눠서
  	나머지가 0이면 문자열을 "문자열" 이라고 입력하고
  	나머지가 1이면 정수 100을 입력하고
  	나머지가 2이면 영문자를 랜덤하게 입력하고
  	나머지가 3이면 실수를 2.0 ~ 7.0까지 랜덤하게 만들어서 입력한다.
  	
  	그리고 
  	
  	꺼내서 출력하는데
  		꺼낸 데이터가 문자열이면 "문자열 데이터" 로
  		정수면 25를 더한 정수를
  		영문자면 대소문자를 바꿔서
  		실수면 소수 셋째자리에서 반올림해서
  		
 */


public class Ex01 {
	
	public Ex01() {
		
		Object[] Arr = new Object[10];
		
		for(int i = 0; i < Arr.length; i++) {
		
			int rnum = (int)(Math.random()*15+1);

			switch(rnum%4){
			case 0:
				String s = "문자열";
				System.out.println("랜덤숫자는 : " + rnum);
				Arr[i] = s;
				break;
			case 1:
				int no = 100;
				System.out.println("랜덤숫자는 : " + rnum);
				Arr[i] = no;
				break;
			case 2:
				int tmp = (int)(Math.random()*52);
				if(tmp < 26) {
					Arr[i] = (char) (tmp + 'A');
				} else {
					Arr[i] = (char) (tmp % 26 + 'a');
				}
				System.out.println("랜덤숫자는 : " + rnum);
				break;
			case 3:
				double fnum = (Math.random()*6+2);
				System.out.println("랜덤숫자는 : "+ rnum);
				Arr[i] = fnum;
				break;
			}
		}
		System.out.println("==============================");
		for(int i = 0; i < Arr.length ; i++) {
			if(Arr[i] instanceof String) {
				System.out.println(Arr[i] + "데이터");
			} else if(Arr[i] instanceof Character) {
				if((char)Arr[i]+1 <= 90+1) {
					Arr[i]  = ((char)((char)Arr[i] + 32));
					System.out.println((char)Arr[i]);
				} else {
					Arr[i] = ((char)((char)Arr[i] - 32));
					System.out.println((char)Arr[i]);
				}
				
			} else if(Arr[i] instanceof Integer) {
				System.out.println((int)Arr[i]+25);
			}else if(Arr[i] instanceof Double) {
			 System.out.println((Math.round((double)Arr[i]*100)/100.0));
			}
		}
	
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
