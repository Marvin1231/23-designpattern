package com.marving.dp.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator extends Mediator{

	private List<ConcreteColleague1> clist1 = new ArrayList<ConcreteColleague1>();
	private List<ConcreteColleague2> clist2 = new ArrayList<ConcreteColleague2>();
	
	@Override
	public void colleagueChanged(Colleague c) {
		System.out.print(c.getClass() + "------");
		if(c instanceof ConcreteColleague1){
			for(Colleague cc:clist2){
				cc.action();
			}
		} else{
			for(Colleague cc:clist1){
				cc.action();
			}
		}
	}
	
	public void register(List<ConcreteColleague1> l1,List<ConcreteColleague2> l2){
		this.clist1.clear();
		this.clist2.clear();
		this.clist1.addAll(l1);
		this.clist2.addAll(l2);
	}

}
