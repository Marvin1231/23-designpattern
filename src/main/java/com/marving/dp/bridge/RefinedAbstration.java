package com.marving.dp.bridge;

//修正抽象化角色
public class RefinedAbstration extends Abstration{

	public RefinedAbstration(Implementor imp) {
		super(imp);
	}
	
	public void operation(){
		System.out.println("RefinedAbstration");
		super.operation();
	}

}
