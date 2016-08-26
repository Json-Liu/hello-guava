package com.cache;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;

/***
 ** @Author JosonLiu
 ** @Date 2016年8月5日
 ** @Version 1.0
 ***/
public class LoadingCacheDemo {
	private static final ExecutorService executor =  Executors.newFixedThreadPool(10);
	private static final LoadingCache<Integer, Integer> testCache = CacheBuilder
													   .newBuilder()
													   .expireAfterAccess(5, TimeUnit.SECONDS)// 5 秒钟失效
													   .refreshAfterWrite(2, TimeUnit.SECONDS)// 2秒后刷新
													   .build(new CacheLoader<Integer, Integer>(){
														  @Override
														  public Integer load(Integer key){//加载函数
															  System.out.println("loading ....");
															  return key;
														  }
														  @Override
														  public ListenableFuture<Integer> reload(final Integer key,Integer oldValue){//异步加载机制
															  ListenableFutureTask<Integer> task = ListenableFutureTask.create(
																	  new Callable<Integer>() {
																		  @Override
																		  public Integer call(){
																			  System.out.println("refresh ....");
																			  return load(key)+1;
																		  }
																	}
															  );
															  executor.execute(task);
															  return task;
														  }
													   });
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		test_Cache();
	}
	/**
	    * 将相应字符串格式的时间转换为DateTime
	    * @param dateTime
	    * @param pattern
	    * @return
	    */
	   public static DateTime strToDateTime(String dateTime,String pattern){
	       DateTime result = new DateTime();
	       DateTimeFormatter formatter = DateTimeFormat.forPattern(pattern);
	       result = formatter.parseDateTime(dateTime);
	       return result;
	   }
	private static void test_Cache() throws InterruptedException,
			ExecutionException {
		for (int i = 0; i < 10; i++) {
			testCache.put(i, i);
		}
		Thread.sleep(3001);//休息 2 秒 
		System.out.println(testCache.get(6));
		Thread.sleep(3000);//休息 3 秒 
		System.out.println(testCache.get(5));
	}
}
