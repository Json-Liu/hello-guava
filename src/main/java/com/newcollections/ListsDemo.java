package com.newcollections;


import java.util.ArrayList;
import java.util.List;

import com.google.common.collect.Lists;

/***
 ** @Author JosonLiu
 ** @Date 2016年7月28日
 ** @Version 1.0
 ***/
public class ListsDemo {
	public static void main(String[] args) {
		//类型推断
		List<Integer> list = Lists.newArrayList();
		//创建时直接赋值
		List<Integer> list2 = Lists.newArrayList(1,2,3,4);
		//提高初值化集合大小的可读性
		List<Integer> list3 = Lists.newArrayListWithCapacity(5);
		List<Integer> list4 = Lists.newArrayListWithExpectedSize(5);
		Lists.reverse(list);//反转列表
		List<List<Integer>> partition = Lists.partition(list, 2);//按指定大小分割列表
	}
}
