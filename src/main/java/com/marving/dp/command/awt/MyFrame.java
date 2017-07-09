package com.marving.dp.command.awt;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel panel;
	private YellowCommand btnYellow;
	private RedCommand btnRed;
	private ExitCommand btnExit;
	
	public MyFrame(){
		super("命令模式");
		panel = new JPanel();
		this.add(panel);
		
		btnYellow = new YellowCommand("黄色",panel);
		btnRed = new RedCommand("红色",panel);
		btnExit = new ExitCommand("退出");
		
		panel.add(btnYellow);
		panel.add(btnRed);
		panel.add(btnExit);
		
		//设置监听对象
		btnYellow.addActionListener(this);
		btnRed.addActionListener(this);
		btnExit.addActionListener(this);
		
		//
		this.setVisible(true);
		this.setSize(400,300);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		MyCommand mycommand = (MyCommand)arg0.getSource();
		mycommand.execute();		
	}
	public static void main(String[] args){
		new MyFrame();
	}

}
