import org.junit.Test;

import com.marving.dp.state.Context;

public class StateTest {

	@Test
	public void test() {
		Context context = new Context();
		context.handle1();
		context.handle2();
	}

}
