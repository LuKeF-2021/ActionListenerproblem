package com.qa.GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.qa.listeners.AddButtonClicked;

public class SetupGUI{
	
	public String championName;
	public JButton addChamp = new JButton();


	public void createGUI() {
	
	String[] champCosts = {"450", "1350", "3150", "4800", "6300", "7800"};
	String[] champClasses = {"Marksman", "Mage", "AP Fighter", "AP Assassin", "AD Fighter", "AD Assassin", "Tank", "Enchanter"};
			
	JPanel panel = new JPanel();
	JFrame frame = new JFrame();
	frame.setSize(500, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.add(panel);
	
	panel.setLayout(null);
	
	JLabel champion = new JLabel("Champion Name:");
	champion.setBounds(20, 40, 180, 25);
	panel.add(champion);
	
	JTextField champNameText = new JTextField("");
	champNameText.setBounds(210, 40, 200, 25);
	panel.add(champNameText);
	
	JLabel champCost = new JLabel("Champion Cost (BE):");
	champCost.setBounds(20, 80, 180, 25);
	panel.add(champCost);
	
	JComboBox<String> costs = new JComboBox<String>(champCosts);
	costs.setBounds(210, 80, 200, 25);
	panel.add(costs);
	
	JLabel champClass = new JLabel("Champion Class:");
	champClass.setBounds(20, 120, 180, 25);
	panel.add(champClass);
	
	JComboBox<String> champClassSelect = new JComboBox<String>(champClasses);
	champClassSelect.setBounds(210, 120, 200, 25);
	panel.add(champClassSelect);
	
	JLabel champLanes = new JLabel("Champion Role(s) Played:");
	champLanes.setBounds(20, 160, 180, 25);
	panel.add(champLanes);
	
	JCheckBox topLane = new JCheckBox("Top Lane");
	topLane.setBounds(210, 160, 90, 25);
	panel.add(topLane);
	JCheckBox jungle = new JCheckBox("Jungle");
	jungle.setBounds(300, 160, 90, 25);
	panel.add(jungle);
	JCheckBox midLane = new JCheckBox("Mid Lane");
	midLane.setBounds(390, 160, 90, 25);
	panel.add(midLane);
	JCheckBox botLaneADC = new JCheckBox("ADC");
	botLaneADC.setBounds(210, 190, 90, 25);
	panel.add(botLaneADC);
	JCheckBox botLaneSupp = new JCheckBox("Support");
	botLaneSupp.setBounds(300, 190, 90, 25);
	panel.add(botLaneSupp);
	
	JLabel champReleaseDate = new JLabel("Champion Release Date:");
	champReleaseDate.setBounds(20, 240, 180, 25);
	panel.add(champReleaseDate);
	
	JLabel champOwned = new JLabel("I own this Champion:");
	champOwned.setBounds(20, 280, 180, 25);
	panel.add(champOwned);
	
	JCheckBox champIsOwned = new JCheckBox("Owned");
	champIsOwned.setBounds(210, 280, 90, 25);
	panel.add(champIsOwned);
	
	addChamp.setText("Add Champion");
	addChamp.setBounds(20, 500, 150, 30);
	AddButtonClicked click = new AddButtonClicked();
	addChamp.addActionListener(click);
	panel.add(addChamp);
	
	
	
	frame.setVisible(true);
	
}
	
	

// db field ideas, Owned (true/false), On sale (true/false)
	
}
