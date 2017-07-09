package com.marving.dp.command;

import java.util.List;

//具体命令角色
public class ConcreteCommand implements Command{
	private List<Receiver> receivers;
	public ConcreteCommand(List<Receiver> receivers){
		this.receivers = receivers;
	}
	@Override
	public void execute() {
		for(Receiver receiver: receivers){
			receiver.action();
		}
	}

}
