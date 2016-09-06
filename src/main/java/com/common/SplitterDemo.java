package com.common;

import com.google.common.base.Splitter;

/***
 ** @Author JosonLiu
 ** @Date 2016年9月6日
 ** @Version 1.0
 **/
public class SplitterDemo {
	public static void main(String[] args) {
		splitter_Demo();
	}
	private static void splitter_Demo(){
		String originStr = ",a,b,,d,";
		/**
		 * 用JDK 尾部的分隔符会被丢弃
		 */
		String[] split = originStr.split(",");
		for (String each : split) {
			System.out.println("|" + each +"|");
		}
		System.out.println("--------------我是分隔符-----------------");
		/**
		 * 用Splitter拆分 支持字符、字符串、正则表达式、字符匹配器、固定长度拆分 等 
		 */
		Iterable<String> splitterResult = Splitter.on(',').omitEmptyStrings().split("hello,world,,,,   Joson ,,,Liu");//自动过滤空格 
		for (String each : splitterResult) {
			System.out.println("|" + each +"|");
		}
		System.out.println("--------------我是分隔符-----------------");
		Iterable<String> splitterFixLen = Splitter.fixedLength(3).split("hello,world");//固定长度拆分  最后一段可能比指定长度短
		for (String each : splitterFixLen) {
			System.out.println("|" + each +"|");
		}
		
	}
}

