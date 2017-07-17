import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.marving.dp.command.Command;
import com.marving.dp.command.ConcreteCommand;
import com.marving.dp.command.Invoker;
import com.marving.dp.command.Receiver;

public class CommandTest {

	@Test
	public void test() {
		List<Receiver> receivers = new ArrayList<Receiver>();
		receivers.add(new Receiver("Guo"));
		receivers.add(new Receiver("Zhang"));
		Command command = new ConcreteCommand(receivers);
		Invoker invoker = new Invoker();
		invoker.setCommand(command);
		invoker.action();
	}

}
