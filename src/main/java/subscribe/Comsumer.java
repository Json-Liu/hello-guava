package subscribe;

import com.google.common.eventbus.Subscribe;
/**
 * 
 * @author liuzhian
 *
 */
public class Comsumer {
	@Subscribe
	public void listen(MessageBody messageBody){
		String formatStr = "Receive message:%s , from %s";
		String outString = String.format(formatStr, messageBody.getMsg(),messageBody.getProducer());
		System.out.println(outString);
	}
	@Subscribe
	public void listen2(MessageBody messageBody){
		System.out.println("Hello World...");
	}
}
