package day17;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import day17.event.*;

public class ColorPick extends JFrame {
	public ColorClass main;
	public JPanel panel, bPanel;
	public JButton btn1, btn2, btn3;
	public Color color;
	
	public ColorPick(ColorClass main) {
		this.main = main;
		// X버튼이 눌러졌을 때 현재 창만 닫아줘야 한다.
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		
		
		//panel 초기화
		panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setSize(new Dimension(200,180));
		
		//button 초기화
		btn1 = new JButton("색적용");
		btn2 = new JButton("색선택");
		btn3 = new JButton("닫  기");
		
		// button에 이벤트 차가하기
		
		//btn1
		btn1.addActionListener(new ColorSet(this));
		
		
		//btn2
		btn2.addActionListener(new ChooseEvent(this));
		
		//btn3
		btn3.addActionListener(new CloseEvt(this));
		
		// button 사이즈 적용
		btn1.setPreferredSize(new Dimension(80,20));
		btn2.setPreferredSize(new Dimension(85,20));
		btn3.setPreferredSize(new Dimension(80,20));
		
		bPanel.add(btn1, BorderLayout.WEST);
		bPanel.add(btn2, BorderLayout.CENTER);
		bPanel.add(btn3, BorderLayout.EAST);
		
		this.add(panel, BorderLayout.CENTER);
		this.add(bPanel, BorderLayout.SOUTH);
		
		
		this.setSize(250,270);
		this.setVisible(false);
	}
}
