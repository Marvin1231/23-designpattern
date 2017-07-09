package com.marving.dp.command.awt;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;

public class YellowCommand extends JButton implements MyCommand{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel p;
	public YellowCommand(String name,JPanel p){
		super(name);
		this.p = p;
	}
	@Override
	public void execute() {
		p.setBackground(Color.yellow);
	}

}
