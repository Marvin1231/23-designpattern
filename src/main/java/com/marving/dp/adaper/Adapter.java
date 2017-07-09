package com.marving.dp.adaper;

//适配器角色
public class Adapter extends Adaptee implements Target {

	@Override
	public void request() {	
		super.specificRequest();
	}
	
}
