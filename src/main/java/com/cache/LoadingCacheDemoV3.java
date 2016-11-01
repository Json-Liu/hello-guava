package com.cache;

import java.util.concurrent.TimeUnit;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;
import com.google.common.cache.RemovalListener;
import com.google.common.cache.RemovalNotification;

/***
 ** @Author JosonLiu
 ** @Date 2016年10月31日
 ** @Version 1.0
 **/
public class LoadingCacheDemoV3 {
	private static final LoadingCache<Integer, Integer> loadingCache = CacheBuilder.newBuilder()
																.maximumSize(6) //设置最大容量
																.expireAfterAccess(3, TimeUnit.SECONDS) //当缓存对象有 3秒内没有 读/写 操作则移除,移除的触发是过期后的下一次访问
																.removalListener(new RemovalListener<Integer, Integer>() {//设置移除元素的监听事件 
																	@Override
																	public void onRemoval( RemovalNotification<Integer, Integer> notification) {
																		System.out.println("key: " + notification.getKey() + " value: " + notification.getValue() + " has been removed. cache size : " + loadingCache.size() );
																	}
																})
																.build(new CacheLoader<Integer,Integer>(){
																		@Override
																		public Integer load(Integer key) throws Exception {
																			System.out.println("key: "+key +" is loading value.");
																			return key+1;
																		}});
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			if( i == 6){
				loadingCache.getUnchecked(0); //验证 cache 的移除原则是移除最近最少使用的元素
			}
			loadingCache.getUnchecked(i);
		}
		try {
			TimeUnit.SECONDS.sleep(4);
		} catch (InterruptedException e) {
			// ignore
		}
		System.out.println(" will to remove expire keys.");
		loadingCache.getUnchecked(11);//触发移除过期的KEY.
	}
}

