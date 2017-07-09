package com.marving.dp.chainOfResponsibility;

//具体处理者角色
public class ConcreteHandler extends Handler{

	@Override
	public void handleRequest() {
		if(super.getSuccessor()!= null){
			System.out.println("请求传递给：" + super.getSuccessor());
			super.getSuccessor().handleRequest();
		} else{
			System.out.println("请求处理");
		}	
	}

}
