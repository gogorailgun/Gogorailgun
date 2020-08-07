package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ColorClass {
	JFrame frame;
	JPanel panel,bPanel;
	JButton btn1, btn2;
	ColorPick cPick;
	
	public ColorClass(){
		frame = new JFrame("★★★ 칼라보기 ★★★");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // X 버튼 이벤트 처리
		
		// ColorPick 초기화
		cPick = new ColorPick(this);
		
		// 패널 만들기
		panel = new JPanel();
		// 패널 배경색 설정
		
		// 색 선택하고
		JColorChooser choose = new JColorChooser();
		
		
		Color color = new JColorChooser().showDialog(choose, "초기색상선택",Color.WHITE);
		// 색 적용하고
		panel.setBackground(color);
		
		// 버튼만들기
		btn1 = new JButton("색변경");
		btn2 = new JButton("Close");
		// 버튼 사이즈 변경
		btn1.setPreferredSize(new Dimension(147,30));
		btn2.setPreferredSize(new Dimension(147,30));
		
		// 닫기버튼
		btn1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				cPick.setVisible(true);
			}
		});
		btn2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		// 프레임에 패널추가.
		bPanel = new JPanel(new BorderLayout());
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.EAST);
		// 프레임에 패널 추가
		frame.add(panel, BorderLayout.CENTER);
		frame.add(bPanel, BorderLayout.SOUTH);
		
		panel = new JPanel();
		
		frame.setSize(300,330); // 창 사이즈 셋팅
		frame.setVisible(true); // 창 보이게 셋팅
		frame.setResizable(false); //창크기 변경 불가능
		
	}

	public static void main(String[] args) {
		new ColorClass();
	}

}
