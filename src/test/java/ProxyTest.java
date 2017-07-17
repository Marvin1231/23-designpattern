import org.junit.Test;

import com.marving.dp.proxy.ProxySubject;
import com.marving.dp.proxy.RealSubject;
import com.marving.dp.proxy.Subject;

public class ProxyTest {

	@Test
	public void test() {
		Subject subject = new ProxySubject(new RealSubject());
		subject.request();
	}

}
