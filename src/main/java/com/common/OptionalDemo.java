package com.common;

import com.google.common.base.Optional;

/***
 ** @Author JosonLiu
 ** @Date 2016年7月28日
 ** @Version 1.0
 ***/
public class OptionalDemo {
	public static void main(String[] args) {
		Optional<Integer> test1 = Optional.of(5);
		System.out.println(test1.get());
		Optional<Integer> test2 = Optional.fromNullable(null);
		System.out.println(test2.or(2));//当test2 为 NULL 时返回默认值 2 
	}
	
}
