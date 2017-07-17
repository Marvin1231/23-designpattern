import org.junit.Test;

import com.marving.dp.decorator.Component;
import com.marving.dp.decorator.ConcreteComponent;
import com.marving.dp.decorator.ConcreteDecorator;

public class DecratorTest {

	@Test
	public void test() {
		Component component = new ConcreteDecorator(new ConcreteComponent());
		component.operation();
	}

}
