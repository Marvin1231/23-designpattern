package com.marving.dp.visitor;

//具体访问者角色
//可更换行为
public class ConcreteVisitor implements Visitor{

	@Override
	public void visit(ConcreteElement1 el1) {
		el1.operation();
	}

	@Override
	public void visit(ConcreteElement2 el2) {
		el2.operation();
	}
}
