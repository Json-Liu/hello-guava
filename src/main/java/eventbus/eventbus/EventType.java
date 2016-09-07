package eventbus.eventbus;
import com.google.common.eventbus.EventBus;
/***
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public enum EventType {
	SUCESS(new EventBus("success event")),
	FAILURE(new EventBus("failure event"));
	private EventBus eventBus;
	public EventBus getEventBus() {
		return eventBus;
	}
	private EventType(EventBus eventBus){
		this.eventBus = eventBus;
	}
}

