package com.yy.dao;

import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import com.yy.bean.FlexTeacher;

/***
 ** @Author JosonLiu
 ** @Date 2016年7月30日
 ** @Version 1.0
 ***/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/appContext.xml")
public class FlexTeacherTest {
	@Autowired
	private FlexTeacherMapper flexTeacherMapper;
	private static final ThreadPoolExecutor EXECUTOR = new ThreadPoolExecutor(10, 30, 0L, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(255));
	private LoadingCache<Long, FlexTeacher> flexTeacherCacheMap = CacheBuilder
			  .newBuilder()
			  .refreshAfterWrite(60, TimeUnit.SECONDS)//1 分钟更新一次
			  .expireAfterAccess(10, TimeUnit.MINUTES)//10 分钟内无人访问 则删除
			  .build(new CacheLoader<Long, FlexTeacher>(){
				@Override
				public FlexTeacher load(Long key)
						throws Exception {
					System.out.println("load....");
					FlexTeacher value = flexTeacherMapper.selectByUid(key);
					if(value == null ){
						value = new FlexTeacher();
					}
					return value;
				}
				@Override
				   public ListenableFuture<FlexTeacher> reload(final Long key, FlexTeacher oldValue) throws Exception {
					   ListenableFutureTask<FlexTeacher> task = ListenableFutureTask.create(
							   new Callable<FlexTeacher>() {
								   @Override
								   public FlexTeacher call() throws Exception {
									   return load(key);
								   }
							   });
					   System.out.println("refresh....");
					   EXECUTOR.execute(task);
					   return task;
				   }
			  });
	@Test
	public void test_GetByUid() throws Exception{
		Long uid = 50075120L;
		FlexTeacher selectObj = flexTeacherMapper.selectByUid(uid);
		flexTeacherCacheMap.put(uid, selectObj);
		FlexTeacher flexTeacher = flexTeacherCacheMap.get(uid);
		System.out.println(ToStringBuilder.reflectionToString(flexTeacher));
	}
	@Test
	public void test(){
		List<Long> uids = flexTeacherMapper.selectOnlineTeacherUids();
		Assert.assertNotNull(uids);
		System.out.println(uids.size());
		System.out.println(uids.get(0));
	}
}
