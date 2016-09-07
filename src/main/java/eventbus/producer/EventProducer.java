package eventbus.producer;

import com.google.common.eventbus.EventBus;

import eventbus.event.FailEvent;
import eventbus.event.SucEvent;
import eventbus.eventbus.EventType;

/***事件产生者
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class EventProducer {
	private static EventBus sucEventBus = EventType.SUCESS.getEventBus();
	private static EventBus failEventBus = EventType.FAILURE.getEventBus();
	public<T> void addSucListener( T t){
		sucEventBus.register(t);
	}
	public<T> void addFailListener( T t){
		failEventBus.register(t);
	}
	public void publishSucEvent(){
		SucEvent sucEvent = new SucEvent();
		sucEvent.setCode(1);
		sucEvent.setValue(" work  done success.");
		sucEventBus.post(sucEvent);
	}
	public void publishFailEvent(){
		FailEvent failEvent = new FailEvent();
		failEvent.setCode(1);
		failEvent.setValue(" work  done fail.");
		failEventBus.post(failEvent);
	}
}

