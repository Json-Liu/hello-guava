package com.common;

import java.util.List;

import com.google.common.base.Joiner;
import com.google.common.collect.Lists;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月6日
 ** @Version 1.0
 **/
public class StringsDemo {
	public static void main(String[] args) {
		joiner_Demo();
	}
	private static void joiner_Demo(){
		/**
		 * 用 逗号(,) 将数组元素连接起来
		 */
		Joiner joiner = Joiner.on(",") ;
		List<Integer> list = Lists.newArrayList(1,2,3,4,5);
		System.out.println( joiner.join(list) );
		/**
		 * 用 逗号(,) 将数组元素连接起来,遇到 NULL 元素则跳过
		 */
		List<Integer> listWithNull = Lists.newArrayList(1,2,3,null,4,5);
		Joiner joinerSkipNull = Joiner.on(",").skipNulls() ;
		System.out.println( joinerSkipNull.join(listWithNull) );
		/**
		 * 用 逗号(,) 将数组元素连接起来,遇到 NULL 元素则用 空字符替代
		 */
		Joiner joinerReplaceNull = Joiner.on(",").useForNull("") ;
		System.out.println( joinerReplaceNull.join(listWithNull) );
	}
}

