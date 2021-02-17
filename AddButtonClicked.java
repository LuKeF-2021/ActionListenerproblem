package com.qa.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import com.qa.GUI.SetupGUI;

public class AddButtonClicked extends SetupGUI implements ActionListener{

	
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == addChamp) {
			System.out.println("add champ button clicked");
		}else {
			System.out.println("not equal");
		}
		
	}
	
}
