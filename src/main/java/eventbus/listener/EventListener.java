package eventbus.listener;
import org.joda.time.DateTime;

import com.google.common.eventbus.Subscribe;

import eventbus.event.FailEvent;
import eventbus.event.SucEvent;

/***事件监听 / 消费者
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class EventListener {
	@Subscribe
	public void getSucEvent( SucEvent sucEvent ){
		System.out.println(getClass().getSimpleName() + " get message :"+sucEvent +" at " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss") );
	}
	@Subscribe
	public void getFailEvent(FailEvent failEvent){
		System.out.println(getClass().getSimpleName() + " get message :"+failEvent +" at " + DateTime.now().toString("yyyy-MM-dd HH:mm:ss") );
	}
}

