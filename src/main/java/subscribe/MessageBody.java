package subscribe;
/**
 * 定义一个消息体 
 * @author liuzhian
 *
 */
public class MessageBody {
	private String producer;//消息产生者
	private String msg;//消息体
	public String getProducer() {
		return producer;
	}
	public void setProducer(String producer) {
		this.producer = producer;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
}
