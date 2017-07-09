package com.marving.dp.command.awt;


import javax.swing.JButton;

public class ExitCommand extends JButton implements MyCommand{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ExitCommand(String name){
		super(name);
	}
	@Override
	public void execute() {
		System.exit(0);
	}

}
