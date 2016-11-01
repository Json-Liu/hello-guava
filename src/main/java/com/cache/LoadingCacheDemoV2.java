package com.cache;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.CacheStats;
import com.google.common.cache.LoadingCache;

/***
 ** @Author JosonLiu
 ** @Date 2016年10月31日
 ** @Version 1.0
 **/
public class LoadingCacheDemoV2 {
	private static final LoadingCache<Integer, Integer> loadingCache = CacheBuilder.newBuilder()
																.recordStats()//开启 缓存使用情况纪录
																.build(new CacheLoader<Integer,Integer>(){
																		@Override
																		public Integer load(Integer key) throws Exception {
																			System.out.println("key: "+key +" is loading value.");
																			return key+1;
																		}});
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			loadingCache.getUnchecked(i);
		}
		for (int i = 0; i < 10; i++) {
			loadingCache.getUnchecked(i);
		}
		for (int i = 0; i < 10; i++) {
			loadingCache.invalidate(i);
		}
		for (int i = 0; i < 10; i++) {
			loadingCache.getUnchecked(i);
		}
		CacheStats stats = loadingCache.stats();
		System.out.println(stats);
		System.out.println(stats.hitRate());
		System.out.println(stats.averageLoadPenalty() / 1000000);
	}
}

