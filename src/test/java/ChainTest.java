import org.junit.Test;

import com.marving.dp.chainOfResponsibility.ConcreteHandler;
import com.marving.dp.chainOfResponsibility.Handler;

public class ChainTest {

	@Test
	public void test() {
		Handler h1 = new ConcreteHandler();
		Handler h2 = new ConcreteHandler();
		Handler h3 = new ConcreteHandler();
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		h1.handleRequest();
	}

}
