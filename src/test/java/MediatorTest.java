import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.marving.dp.mediator.ConcreteColleague1;
import com.marving.dp.mediator.ConcreteColleague2;
import com.marving.dp.mediator.ConcreteMediator;

public class MediatorTest {

	@Test
	public void test() {
		
		List<ConcreteColleague1> clist1 = new ArrayList<ConcreteColleague1>();
		List<ConcreteColleague2> clist2 = new ArrayList<ConcreteColleague2>();
		ConcreteMediator m = new ConcreteMediator();
		clist1.add(new ConcreteColleague1(m));
		clist2.add(new ConcreteColleague2(m));
		clist2.add(new ConcreteColleague2(m));
		m.register(clist1, clist2);
		m.colleagueChanged(new ConcreteColleague1(m));
		m.colleagueChanged(new ConcreteColleague2(m));
	}

}
