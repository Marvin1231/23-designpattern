import java.util.concurrent.Callable;

import org.junit.Test;

import com.marving.dp.singleton.GlobalNum;
/**
 * 
 * @title: 多线程测试单例设计模式
 * @author: Marvin Guo
 * @create time: 2016年11月18日
 */
@SuppressWarnings("unused")
public class SingletonTest {

	@Test
	public void test() {
		Thread th1 = new Thread(new NumThread("A"));
		Thread th2 = new Thread(new NumThread("B"));
		th1.start();
		th2.start();
	}

}

class NumThread implements Runnable{
	
	private String threadName = "";
	
	public NumThread(String threadName){
		this.threadName = threadName;
	}
	
	public String getThreadName() {
		return threadName;
	}
	public void setThreadName(String threadName) {
		this.threadName = threadName;
	}
	@Override
	public void run() {
		int num = 0;
		for(int i = 0;i<5;i++){
			num = GlobalNum.getInstance().getNum();
			System.out.println(threadName+":  "+ num);
		}
	}
	
}
