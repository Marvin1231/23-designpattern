import org.junit.Test;

import com.marving.dp.builder.Director;
import com.marving.dp.builder.Product;

public class BuilderTest {

	@Test
	public void test() {
		Director director = new Director();
		Product product = director.build();
		product.show();
	}

}
