package subscribe;
/**
 * 消息产生者
 * @author liuzhian
 *
 */
public class Producer {
	private final MsgCenter _msgCenter;
	private final MessageBody _messageBody;
	/**
	 * 创建消息 并通过消息中心进行消息的分发
	 * @param msgCenter 消息中心
	 * @param messageBody 消息内容
	 */
	public Producer(MsgCenter msgCenter,MessageBody messageBody){
		_msgCenter = msgCenter;
		_messageBody= messageBody;
	}
	public void postMsg(){
		_msgCenter.sendMsg(_messageBody);//发送消息
	}
}
