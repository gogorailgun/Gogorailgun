package day18;

import javax.swing.*;

public class Test01 {

	public Test01() {
		boolean bool = true;
		while(bool) {
			String sno = JOptionPane.showInputDialog("1 ~ 10 사이의 정수를 입력해 주세요");
			if(sno.equals("q")) {
				bool = false;
				continue;
				// ==> break;
			}
			
			int no = 0;
			
			
			
			try {
				// 숫자 형태가 아닌 문자열이 입력 될 경우는 숫자 포멧 예외가 발생 할 것이므로
				// 예외 처리를 해준다
				no = Integer.parseInt(sno);
				if(no < 1) {
					// 이 부분에서 강제로 우리가 정한 예외 클래스의 예외를 발생 시켜야 한다.
					// 따라서 우리가 만든 예외 클래스를 강제로 던저야 한다.
					throw new Excpt01();
				} else if(no > 10) {
					throw new NumberFormatException();
				}
				
			} catch(NumberFormatException e) {
				e.printStackTrace();
				continue;
			} catch(Excpt01 e) {
				JOptionPane.showMessageDialog(null, e.toString());
				continue;
			} catch(Exception e) {
				e.printStackTrace();
				continue;
			}
			
			JOptionPane.showMessageDialog(null, "입력한 숫자 : " + no);
		}
	}
	public static void main(String[] args) {
		new Test01();
	}

}

// 1 ~ 10 사이 이외의 숫자가 입력되면 발생될 예외
// 1. Exception 클래스를 상속 받은 클래스를 만든다.


class Excpt01 extends Exception{
// 예외의 정보를 출력할 toString() 함수를 오버라이드 한다.	
	public String toString() {
		String s = getClass().getName();
		String message = "1~10 사이의 숫자가 아닙니다.";
		return (message != null) ? (s + ": "+ message) : s;
		//return "1 ~ 10 사이의 숫자가 아닙니다요";
		
	}
}
