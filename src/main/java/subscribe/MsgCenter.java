package subscribe;

import com.google.common.eventbus.EventBus;

/**
 * 消息中心 进行消息的推送
 * @author Administrator
 *
 */
public class MsgCenter {
	private static EventBus msgBus = new EventBus("JosonLiu");
	/**
	 * 注册一个类 为监听者
	 * @param clazz
	 */
	public void addListener(Object obj){
		msgBus.register(obj);
	}
	/**
	 * 把接收到的消息发送给监听者
	 * @param msg
	 */
	public void sendMsg(MessageBody msg){
		msgBus.post(msg);
	}
}
