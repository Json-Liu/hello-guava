package com.concurrency;

import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

import com.google.common.collect.Lists;
import com.google.common.util.concurrent.FutureCallback;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListeningExecutorService;
import com.google.common.util.concurrent.MoreExecutors;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月6日
 ** @Version 1.0
 **/
public class ListenableFutureDemo {
	/**
	 * 初始化一个固定大小为2的线程池
	 */
	private static ListeningExecutorService executorService = MoreExecutors.listeningDecorator(Executors.newFixedThreadPool(2));
	public static void main(String[] args) {
		test_Future_Callable();
	}
	private static void test_Future_Callable(){
		final ListenableFuture<String> future = executorService.submit(new Callable<String>() {
			@Override
			public String call() throws Exception {
				System.out.println("task doing something..");
				return " callable task ";
			}
		});
		//直接添加监听者 在异步任务执行完后执行 但不太推荐这种方式
		future.addListener(new Runnable() {
			@Override
			public void run() {
				System.out.println("listener doing something...");
			}
		}, executorService);
		//推荐 在异步任务执行完后即会调用 
		Futures.addCallback(future, new FutureCallback<String>() {
			@Override
			public void onFailure(Throwable t) {
				System.out.println("callbacker doing something error");
				try {
					System.out.println( future.get() );
				} catch (Throwable e) {
					// ignore
				}
			}
			@Override
			public void onSuccess(String result) {
				System.out.println("callbacker doing something success");
				try {
					System.out.println("task result" + future.get());
				} catch (Throwable e) {
					// ignore
				} 
			}
		});
	}
}

