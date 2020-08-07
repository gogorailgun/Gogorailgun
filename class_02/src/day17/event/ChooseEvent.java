package day17.event;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


import day17.*;
public class ChooseEvent implements ActionListener{
	ColorPick pick;
	
	public ChooseEvent(ColorPick pick) {
		this.pick = pick;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Color color = JColorChooser.showDialog(pick, "컬러 선택", Color.WHITE);
		pick.panel.setBackground(color);
	}
}
