package com.marving.dp.mediator;

public class ConcreteColleague1 extends Colleague{
	
	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void action() {
		//System.out.println(this.getClass().getSimpleName());
		System.out.println("与" + this.toString() +"见面");
	}

}
