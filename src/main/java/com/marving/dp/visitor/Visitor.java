package com.marving.dp.visitor;

//抽象访问者
public interface Visitor {
	public void visit(ConcreteElement1 el1);
	public void visit(ConcreteElement2 el2);
}
