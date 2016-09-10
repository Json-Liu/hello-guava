package eventbus.test;

import eventbus.event.FailEvent;
import eventbus.event.SucEvent;
import eventbus.listener.EventListener;
import eventbus.producer.EventProducer;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月7日
 ** @Version 1.0
 **/
public class Main {
	public static void main(String[] args) throws InterruptedException {
		EventProducer eventProducer = new EventProducer();
		/**
		 * 添加监听者
		 */
		eventProducer.addSucListener(new EventListener());
		eventProducer.addFailListener(new EventListener());
		eventProducer.addBaseListener(new EventListener());
		/**
		 * 推送成功事件 
		 */
		SucEvent sucEvent = new SucEvent();
		sucEvent.setCode(1);
		sucEvent.setValue("success.");
		eventProducer.publishSucEvent(sucEvent);
		Thread.sleep(1000);
		/**
		 * 推送失败事件
		 */
		FailEvent failEvent = new FailEvent();
		failEvent.setCode(-2);
		failEvent.setValue("fail.");
		eventProducer.publishFailEvent(failEvent);
		/**
		 * 基本类型推送
		 */
		eventProducer.publishBaseEvent("hello world");
		eventProducer.publishBaseEvent(50075120L);
		eventProducer.publishBaseEvent(100);
	}
}

