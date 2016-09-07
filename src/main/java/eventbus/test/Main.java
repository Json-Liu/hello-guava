package eventbus.test;

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
		/**
		 * 推送成功事件 
		 */
		eventProducer.publishSucEvent();
		Thread.sleep(1000);
		/**
		 * 推送失败事件
		 */
		eventProducer.publishFailEvent();
	}
}

