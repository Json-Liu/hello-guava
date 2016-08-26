package com.common;

import static com.google.common.base.Preconditions.*;

/***
 ** @Author JosonLiu
 ** @Date 2016年7月28日
 ** @Version 1.0
 ***/
public class PrecondtionsDemo {
	public static void main(String[] args) {
		int i = -1;
		checkArgument(i >=0,"argument was %s but expected nonnegative",i);
		System.out.println("check pass");
		checkNotNull(i);//不为空
	}
	
}
