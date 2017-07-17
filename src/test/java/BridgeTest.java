import org.junit.Test;

import com.marving.dp.bridge.Abstration;
import com.marving.dp.bridge.ConcreteImplementor;
import com.marving.dp.bridge.Implementor;
import com.marving.dp.bridge.RefinedAbstration;

public class BridgeTest {

	@Test
	public void test() {
		
		Implementor imp = new ConcreteImplementor();
		Abstration abs = new RefinedAbstration(imp);
		abs.operation();
	}

}
