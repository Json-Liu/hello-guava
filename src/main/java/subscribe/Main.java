package subscribe;
/**
 * 测试订阅功能
 * @author liuzhian
 *
 */
public class Main {
	public static void main(String[] args) {
		//1、创建一个消息体
		MessageBody message = new MessageBody();
		message.setProducer("JosonLiu");
		message.setMsg(" Hi Nice to See You ...");
		//2、创建一个消息中心
		MsgCenter msgCenter = new MsgCenter();
		//3、创建一个消息生产者，将其生产的消息PUSH到消息中心
		Producer producer = new Producer(msgCenter, message);
		//4、添加一个订阅消息中心的消费者对象
		msgCenter.addListener(new Comsumer());
		//5、生产者推送消息
		producer.postMsg();//推送消息
		//PS:应用环境中 第5步一般是直接放在第3步中，消息一产生就立即推送到消息中心，让消费者去消费
	}
}
