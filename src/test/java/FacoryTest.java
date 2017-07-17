import org.junit.Test;

import com.marving.dp.factory.simple.ConcreteCreator;
import com.marving.dp.factory.simple.ConcreteProduct;
import com.marving.dp.factory.simple.Creator;
import com.marving.dp.factory.abstractF.Product;

public class FacoryTest {

	@Test
	public void test() {
		Creator creator = new ConcreteCreator();
		Product product = creator.factory(ConcreteProduct.class);
		product.method();
	}

}
