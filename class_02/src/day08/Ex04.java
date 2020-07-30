package day08;

/*
 	문제 4]
 	
 		도형의 정보를 입력받는데
 		입력 형식은
 		
 		
 			0/5 	- 반지름이 5인 원
 			3/5/10	- 밑변이 5이고 높이가 10인 삼각형
 			4/3/4	- 가로가 3이고 세로가 4인 사각형
 			
 		의 형식으로 입력받은 도형의 넓이를 계산해서 출력하세요.
 		
 	참고 ]
 	
 		indexOf(int ch, int fromIndex)
 		
 			ch			: 찾을 문자
 			fromIndex 	: 찾을 시작 위치
 			
 		lastIndexOf(int ch)
 			뒤에서부터 찾을 문자를 검색해서 해당 위치를 반환해준다.
 */

import javax.swing.JOptionPane;

public class Ex04 {
	public static void main(String[] args) {
		
		String str = JOptionPane.showInputDialog("도형/숫자1[/숫자2] 의 형식으로 입력해 주세요!");
		String[] sArr = new String[3];
		
		//실제 데이터 형태의 배열 만들고
		int[] noArr = new int[3];
		
		/*
		sArr[0] = str.substring(0, str.indexOf('/'));
		if(!sArr[0].equals("0")) {
			// 사각형, 삼각형인 경우
			sArr[1] = str.substring(str.indexOf('/')+1 ,str.lastIndexOf('/'));
		} else {
			// 원인 경우
			sArr[1] = str.substring(str.indexOf('/') + 1 );
		}
		*/
		
		
		
		/* 
		String str = "aebedefg";
		
		int idx = str.lastIndexOf('e'); // 마지막 e의 위치
		System.out.println(idx);
		idx = str.indexOf('e', str.indexOf('e') +1);
		// 'e' 부터 e까지 
				  
		System.out.println(idx);
		*/
		
		sArr[1] = sArr[0].equals("0") ? str.substring(str.indexOf('/') +1) :
			str.substring(str.indexOf('/')+1 , str.lastIndexOf('/'));
		sArr[2] = sArr[0].equals("0") ? "0" : str.substring(str.lastIndexOf('/')+1);
		
		for(int i = 0; i < noArr.length; i++) {
			noArr[i] = Integer.parseInt(sArr[i]);
		}
		
		// 데이터 꺼내서 계산해서 출력한다.
		
		
		
	}

}
